package org.example.models;

import java.util.Arrays;

public class ProductClothing extends Product {

    private String size;
    private String[] colours;
    private String[] materials;

    public ProductClothing() {
        super();
    }

    public ProductClothing(
            String uuidValue,
            String nameValue,
            String descriptionValue,
            Double priceValue,
            String sizeValue,
            String[] coloursValue,
            String[] materialsValue
    ) {
        super(uuidValue, nameValue, descriptionValue, priceValue);
        this.size = sizeValue;
        this.colours = coloursValue;
        this.materials = materialsValue;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String[] getColours() {
        return colours;
    }

    public void setColours(String[] colours) {
        this.colours = colours;
    }

    public String[] getMaterials() {
        return materials;
    }

    public void setMaterials(String[] materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return super.toString() + " ProductClothing{" +
                "size='" + size + '\'' +
                ", colours=" + Arrays.toString(colours) +
                ", materials=" + Arrays.toString(materials) +
                '}';
    }
}
