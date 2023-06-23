package org.example.repository;

import org.codehaus.jackson.map.ObjectMapper;
import org.example.models.HardDriveType;
import org.example.models.Product;
import org.example.models.ProductClothing;
import org.example.models.ProductHardDrive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductJSONDAO implements CrudRepository {

    public ProductJSONDAO() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"uuid\":\"EFE\",\"name\":\"TACOS\",\"description\":\"zefzef zefze\",\"price\":14.57,\"size\":\"XL\",\"colours\":[\"white\"],\"materials\":[\"cotton\"]}";
        Product newProduct = mapper.readValue(json, ProductClothing.class);
        productDb.add(newProduct);
    }

    private final List<Product> productDb = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return this.productDb;
    }

    @Override
    public Product findById(String uuid) {
        for (Product eachProduct : productDb) {
            if (eachProduct.getUuid().equals(uuid)) {
                return eachProduct;
            }
        }
        return null;
    }

    @Override
    public Product save(Product newProduct) {
        productDb.add(newProduct);
        return newProduct;
    }

    @Override
    public Product update(Product productToUpdate) {
        // TODO update
        return null;
    }

    @Override
    public boolean deleteById(String uuid) {
        Product productToDelete = null;
        for (Product eachProduct : productDb) {
            if (eachProduct.getUuid().equals(uuid)) {
                productToDelete = eachProduct;
                break;
            }
        }
        if (productToDelete != null) {
            productDb.remove(productToDelete);
            return true;
        }
        return false;
    }
}
