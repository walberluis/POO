package org.example;
import java.util.ArrayList;


public class ShoppingCart {

    private int customerId;
    private ArrayList<Product> productList;

    public ShoppingCart(int customerId) {
        this.customerId = customerId;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public String getContents() {
        StringBuilder contents = new StringBuilder("");

        for (Product p : productList) {
            contents.append(p.getBrand()).append(" - $").append(p.getPrice()).append("\n");
        }
        return contents.toString();
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getItemCount() {
        return productList.size();
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;
    }

}
