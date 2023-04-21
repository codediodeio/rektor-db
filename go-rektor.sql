CREATE TABLE vectors (
    id SERIAL PRIMARY KEY,
    ids TEXT[],
    vector FLOAT[],
    documents TEXT[],
    metadatas TEXT[],
    distances FLOAT[]
);
