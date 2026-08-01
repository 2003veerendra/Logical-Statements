package product;
import java.util.Scanner;

public class Product {

    String productName;
    double price;
    int quantity;

    // Default constructor
    Product() {
        this("Unknown");
    }

    // One parameter constructor
    Product(String productName) {
        this(productName, 0.0);
    }

    // Two parameter constructor
    Product(String productName, double price) {
        this(productName, price, 0);
    }

    // Three parameter constructor
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

        double totalCost = price * quantity;

        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Cost   : " + totalCost);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        new Product(productName, price, quantity);

        sc.close();
    }
}