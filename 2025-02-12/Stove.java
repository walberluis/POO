package org.example;

public class Stove extends Product {
    private int burners;

    public Stove(String brand, String price, int size, int burners) {
        super(brand, price);
        this.burners = burners;
    }

    public int getBurners() {
        return burners;
    }
}
