package AndersenCourse.lesson_4.paymentApp;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Products> shoppingCart = new ArrayList<>();

    public void displayProducts() {
        if (!shoppingCart.isEmpty()) {
            for (Products product : shoppingCart) {
                System.out.println("Product: " + product.productName + "\nQuantity: " + product.quantity
                        + "\nPrice: " + product.price);
            }
        } else {
            System.out.println("Your shopping cart is empty!");
        }
    }

    public void addToCart(String productName, int quantity, int price) {
        if (quantity > 0 && price > 0) {
            Products product = new Products(productName, quantity, price);
            shoppingCart.add(product);
        } else {
            System.out.println("You can not add nothing!");
        }
    }

    public void showTotalSum() {
        int total = 0;
        if (!shoppingCart.isEmpty()) {
            for (Products product : shoppingCart) {
                total += product.price * product.quantity;
            }
            System.out.println("Your total is: " + total);
        } else {
            System.out.println("Your shopping cart is empty!");
        }
    }

    private class Products {
        private String productName;
        private int quantity;
        private int price;

        public Products(String productName, int quantity, int price) {
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }
    }
}
