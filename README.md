# Rektor

Rektor is a highly-scalable, high-performance vector database designed to store and query large collections of high-dimensional vectors. It is designed to be used in a wide variety of applications, from natural language processing to computer vision to recommendation systems.

## Features
* Efficient storage and retrieval of high-dimensional vectors.
* Support for similarity search and nearest neighbor queries.
* Highly scalable and can handle large datasets.
* Simple and easy-to-use API for interacting with the database.
* Written in Go for fast performance and minimal resource usage.

## Installation
Rektor is still in development and not yet available for installation. However, we are actively seeking investors to help us bring Rektor to market. If you are interested in learning more about our vision and becoming a part of our team, please contact us at info@rektor.tech.

## Examples
Here's an example of how to use Rektor in your Go code:

```go
package main

import (
    "github.com/rektor/rektor"
)

func main() {
    // Connect to Rektor database
    db, err := rektor.Connect("localhost:5432", "mydb")
    if err != nil {
        panic(err)
    }
    defer db.Close()

    // Insert a vector into the database
    err = db.Insert("myvector", []float64{1.0, 2.0, 3.0})
    if err != nil {
        panic(err)
    }

    // Find the nearest neighbors of a vector
    neighbors, err := db.NearestNeighbors([]float64{1.0, 1.0, 1.0}, 10)
    if err != nil {
        panic(err)
    }

    // Print the results
    for _, neighbor := range neighbors {
        fmt.Println(neighbor.ID, neighbor.Vector, neighbor.Distance)
    }
}
```

## Performance
Rektor is designed for high performance and scalability, and we have taken a number of measures to optimize its performance.

### Database storage
Rektor uses PostgreSQL as its primary data store, which provides high performance and scalability for storing large collections of high-dimensional vectors.

### API performance
We chose to use Go Fiber as the framework for our API due to its fast performance and low resource usage. Go Fiber is a lightweight and efficient web framework that is designed for high concurrency and low latency. It uses a fast HTTP router and middleware stack, and is optimized for performance under high load.

### Vector search performance
Rektor uses the FAISS library for fast similarity search and nearest neighbor queries. FAISS is a highly optimized library for searching large collections of vectors, and is designed to take advantage of modern CPU architectures and parallel processing.

~TODO:~ Rektor uses Google's ScaNN library for fast similarity search and nearest neighbor queries. ScaNN is a highly optimized library for approximate nearest neighbor search on high-dimensional vectors, and is designed to handle large datasets with fast performance.

We are currently conducting performance benchmarks to measure the performance of Rektor under different workloads and configurations, and will update this section with more information once the results are available.

## Contributions
We welcome contributions from the community. If you would like to contribute to Rektor, please review our contributing guidelines and submit a pull request.

## Issues and feature requests
If you encounter any issues while using Rektor or would like to request a new feature, please submit an issue.

## License
Rektor is available under the MIT License. See the LICENSE file for more information.