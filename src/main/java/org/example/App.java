package org.example;

import org.example.models.HardDriveType;
import org.example.models.Product;
import org.example.models.ProductClothing;
import org.example.models.ProductHardDrive;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // peut pas faire d'instance d'une classe abstraite !
        //Product test = new Product("sf4840", "Stylo", "Ça écrit", 0.39);

        Product tshirt = new ProductClothing("DZD", "Tshirt Pokémon", "C'est un tshirt",
                14.99, "M", new String[]{"Bleu", "Blanc"}, new String[]{"Coton"});
        System.out.println(tshirt.toString());

        Product ddExterne = new ProductHardDrive("AAZ", "Toshiba 4To", "C'est assez grand",
                100.0, 4.0, HardDriveType.HDD);
        System.out.println(ddExterne);

        List<Product> cart = new ArrayList<>();
        cart.add(tshirt);
        cart.add(ddExterne);
    }
}
