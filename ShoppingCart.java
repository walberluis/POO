import java.util.ArrayList;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> productList;

    public ShoppingCart(int customerID) {
        this.customerID = customerID;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getItemCount() {
        return productList.size();
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product p : productList) {
            total += p.getPrice();
        }
        return total;
    }


    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(101);
        Product p1 = new Product("Laptop", 1200.50);
        Product p2 = new Product("Mouse", 25.75);

        cart.addProduct(p1);
        cart.addProduct(p2);

        System.out.println(cart.getTotalPrice());

    }

}
