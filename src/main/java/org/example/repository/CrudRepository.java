package org.example.repository;

import org.example.models.Product;

import java.util.List;

public interface CrudRepository {

    List<Product> findAll();

    Product findById(String uuid);

    Product save(Product newProduct);

    Product update(Product productToUpdate);

    boolean deleteById(String uuid);
}
