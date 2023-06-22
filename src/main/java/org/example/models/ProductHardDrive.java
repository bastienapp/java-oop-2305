package org.example.models;

public class ProductHardDrive extends Product {

    private Double capacity;
    private HardDriveType type;

    public ProductHardDrive(String uuidValue, String nameValue,
                            String descriptionValue, Double priceValue,
                            Double capacity, HardDriveType type) {
        super(uuidValue, nameValue, descriptionValue, priceValue);
        this.capacity = capacity;
        this.type = type;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public HardDriveType getType() {
        return type;
    }

    public void setType(HardDriveType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " ProductHardDrive{" +
                "capacity=" + capacity +
                ", type=" + type +
                '}';
    }
}
