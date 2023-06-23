package org.example;

import org.example.models.Product;
import org.example.repository.CrudRepository;
import org.example.repository.ProductJSONDAO;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        CrudRepository repository = new ProductJSONDAO();

        List<Product> cart = repository.findAll();
        for (Product product : cart) {
            System.out.println(product);
        }
    }
}
