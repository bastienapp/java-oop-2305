package org.example.models;


// Object
public abstract class Product {

    // attributes
    private String uuid;
    private String name;
    private String description;
    private Double price;

    // constructor (si rien n'est renseigné, il possède un constructeur vide)
    public Product(
            String uuidValue,
            String nameValue,
            String descriptionValue,
            Double priceValue
    ) {
        this.uuid = uuidValue;
        this.name = nameValue;
        this.description = descriptionValue;
        this.price = priceValue;
    }

    // getter et setter
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String newUuid) {
        this.uuid = newUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override // que pour le dev
    public String toString() {
        return "Product{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
