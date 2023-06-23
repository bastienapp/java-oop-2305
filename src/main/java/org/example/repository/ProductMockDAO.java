package org.example.repository;

import org.example.models.HardDriveType;
import org.example.models.Product;
import org.example.models.ProductClothing;
import org.example.models.ProductHardDrive;

import java.util.ArrayList;
import java.util.List;

public class ProductMockDAO implements CrudRepository {

    private final List<Product> productDb = new ArrayList<>(
            List.of(
                    new ProductClothing("DZD", "Tshirt Pokémon", "C'est un tshirt",
                            14.99, "M", new String[]{"Bleu", "Blanc"}, new String[]{"Coton"}),
                    new ProductHardDrive("AAZ", "Toshiba 4To", "C'est assez grand",
                            100.0, 4.0, HardDriveType.HDD
                    )
            ));

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
