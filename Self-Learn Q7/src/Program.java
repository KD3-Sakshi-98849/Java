
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }
}

public class Program {

    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, Product> cart = new HashMap<>();
    static ArrayList<String> orderHistory = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Cart");
            System.out.println("4. Place Order");
            System.out.println("5. Order History");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                addProduct();
                break;

            case 2:
                removeProduct();
                break;

            case 3:
                displayCart();
                break;

            case 4:
                placeOrder();
                break;

            case 5:
                displayHistory();
                break;

            case 0:
                System.out.println("Thank you");
                break;

            default:
                System.out.println("Invalid choice");
            }

        } while (choice != 0);
    }

    public static void addProduct() {

        System.out.print("Enter product id: ");
        int id = sc.nextInt();

        System.out.print("Enter product name: ");
        String name = sc.next();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Product product = new Product(id, name, price);

        cart.put(id, product);

        System.out.println("Product added");
    }

    public static void removeProduct() {

        System.out.print("Enter product id: ");
        int id = sc.nextInt();

        if (cart.remove(id) != null) {
            System.out.println("Product removed");
        } else {
            System.out.println("Product not found");
        }
    }

    public static void displayCart() {

        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        System.out.println("\nCart Products:");

        for (Map.Entry<Integer, Product> entry : cart.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void placeOrder() {

        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        double total = 0;

        for (Product product : cart.values()) {
            total = total + product.getPrice();
        }

        String order = "Order Total = " + total;

        orderHistory.add(order);

        cart.clear();

        System.out.println("Order placed successfully");
        System.out.println("Total Amount = " + total);
    }

    public static void displayHistory() {

        if (orderHistory.isEmpty()) {
            System.out.println("No order history");
            return;
        }

        System.out.println("\nOrder History:");

        for (String order : orderHistory) {
            System.out.println(order);
        }
    }
}