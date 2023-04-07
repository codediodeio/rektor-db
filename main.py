import numpy as np
from annoy import AnnoyIndex

class VectorDatabase:
    def __init__(self, dimensions, metric='angular'):
        self.dimensions = dimensions
        self.metric = metric
        self.index = AnnoyIndex(dimensions, metric)
        self.item_mapping = {}
        self.item_counter = 0

    def add_item(self, item_id, vector):
        if len(vector) != self.dimensions:
            raise ValueError(f"Vector must have {self.dimensions} dimensions")

        self.index.add_item(self.item_counter, vector)
        self.item_mapping[self.item_counter] = item_id
        self.item_counter += 1

    def build(self, num_trees=10):
        self.index.build(num_trees)

    def save(self, filename):
        self.index.save(filename)

    def load(self, filename):
        self.index.load(filename)

    def get_nearest_neighbors(self, query_vector, num_neighbors=10, include_distances=False):
        if len(query_vector) != self.dimensions:
            raise ValueError(f"Query vector must have {self.dimensions} dimensions")

        nearest_indices, distances = self.index.get_nns_by_vector(query_vector, num_neighbors, include_distances=True)
        nearest_items = [self.item_mapping[index] for index in nearest_indices]

        if include_distances:
            return list(zip(nearest_items, distances))
        else:
            return nearest_items
