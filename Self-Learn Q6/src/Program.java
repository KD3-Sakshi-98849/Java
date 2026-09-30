
class ECommerceException extends Exception {
    public ECommerceException(String message) {
        super(message);
    }
}

class PaymentException extends ECommerceException {
    public PaymentException(String message) {
        super(message);
    }
}

class InventoryException extends ECommerceException {
    public InventoryException(String message) {
        super(message);
    }
}

class ShippingException extends ECommerceException {
    public ShippingException(String message) {
        super(message);
    }
}

class Order {

    private double amount;
    private int stock;
    private boolean addressAvailable;

    public Order(double amount, int stock, boolean addressAvailable) {
        this.amount = amount;
        this.stock = stock;
        this.addressAvailable = addressAvailable;
    }

    public void makePayment() throws PaymentException {
        if (amount <= 0) {
            throw new PaymentException("Invalid payment amount");
        }

        System.out.println("Payment successful");
    }

    public void checkInventory() throws InventoryException {
        if (stock <= 0) {
            throw new InventoryException("Product is out of stock");
        }

        System.out.println("Product available");
    }

    public void shipOrder() throws ShippingException {
        if (!addressAvailable) {
            throw new ShippingException("Shipping address not available");
        }

        System.out.println("Order shipped successfully");
    }
}

public class Program {

    public static void main(String[] args) {

        Order order = new Order(5000, 10, true);

        try {
            order.makePayment();
            order.checkInventory();
            order.shipOrder();

            System.out.println("Order completed successfully");
        }
        catch (PaymentException e) {
            System.out.println("Payment Error : " + e.getMessage());
        }
        catch (InventoryException e) {
            System.out.println("Inventory Error : " + e.getMessage());
        }
        catch (ShippingException e) {
            System.out.println("Shipping Error : " + e.getMessage());
        }
    }
}
