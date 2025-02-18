package org.example;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart(5);
        TV tv = new TV("Samsung", 599.99, 55);
        Refrigerator fridge = new Refrigerator("LG", 899.99, 300);
        Stove stove = new Stove("GE", 499.99, 4);

        cart.addProduct(tv);
        cart.addProduct(fridge);
        cart.addProduct(stove);

        System.out.println(cart.getTotalPrice());
        System.out.println(cart.getItemCount());


    }
}
