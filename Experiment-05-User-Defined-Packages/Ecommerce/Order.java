package Ecommerce;

public class Order {
    Product product;
    int quantity;

    public Order(Product p, int q) {
        product = p;
        quantity = q;
    }

    public void calculateTotal() {
        double total = product.price * quantity;
        System.out.println("Total Cost: " + total);
    }
}