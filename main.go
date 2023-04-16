package main

import (
    "log"

    "github.com/gofiber/fiber/v2"
    _ "github.com/lib/pq"
)

type Vector struct {
    ID        int       `json:"id"`
    IDs       []string  `json:"ids"`
    Vector    []float64 `json:"vector"`
    Documents []string  `json:"documents"`
    Metadatas []string  `json:"metadatas"`
    Distances []float64 `json:"distances"`
}

func main() {
    // Connect to database and create table (see previous steps)

    app := fiber.New()

    // Define API endpoints and handlers
    app.Post("/vectors", insertVector)
    app.Get("/vectors/:id", getVector)
    app.Get("/vectors/search", searchVectors)

    log.Fatal(app.Listen(":3000"))
}

func insertVector(c *fiber.Ctx) error {
    // Parse vector data from request body
    var vector Vector
    if err := c.BodyParser(&vector); err != nil {
        return err
    }

    // Insert vector into database
    var id int
    err := db.QueryRow(`
        INSERT INTO vectors (ids, vector, documents, metadatas, distances)
        VALUES ($1, $2, $3, $4, $5)
        RETURNING id
    `, vector.IDs, vector.Vector, vector.Documents, vector.Metadatas, vector.Distances).Scan(&id)
    if err != nil {
        return err
    }

    // Return JSON response with inserted vector ID
    response := map[string]int{"id": id}
    return c.JSON(response)
}

func getVector(c *fiber.Ctx) error {
    // Parse vector ID from URL parameter
    id := c.Params("id")

    // Retrieve vector from database
    var vector Vector
    err := db.QueryRow(`
        SELECT id, ids, vector, documents, metadatas, distances
        FROM vectors
        WHERE id = $1
    `, id).Scan(&vector.ID, &vector.IDs, &vector.Vector, &vector.Documents, &vector.Metadatas, &vector.Distances)
    if err != nil {
        return err
    }

    // Return JSON response with retrieved vector data
    return c.JSON(vector)
}

func searchVectors(c *fiber.Ctx) error {
    // Parse query vector from request body
    var query Vector
    if err := c.BodyParser(&query); err != nil {
        return err
    }

    // Search for similar vectors in database
    // (TODO: Implement search algorithm)

    // Return JSON response with search results
    response := []Vector{}
    return c.JSON(response)
}
