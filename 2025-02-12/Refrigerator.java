package org.example;

public class Refrigerator extends Product {

    private int size;

    public Refrigerator(String brand, String price, int size) {
        super(brand, price);
        this.size = size;

    }
}
