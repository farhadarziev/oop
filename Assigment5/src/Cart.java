import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items;
    private double totalPrice;

    public Cart() {
        items = new ArrayList<>();
        totalPrice = 0.0;
    }


    public void addDevice(Device device, int amount) {
        if (device.isAvailable(amount)) {
            for (CartItem item : items) {
                if (item.getDevice().equals(device)) {
                    item.setAmount(item.getAmount() + amount);
                    totalPrice += device.getPrice() * amount;
                    device.reduceStock(amount);
                    return;
                }
            }
            items.add(new CartItem(device, amount));
            totalPrice += device.getPrice() * amount;
            device.reduceStock(amount);
        } else {
            System.out.println("Sorry, not enough stock for " + device.getName());
        }
    }

    public void printItems() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (CartItem item : items) {
                System.out.println(item.getDevice() + " x" + item.getAmount());
            }
        }
    }



    private static class CartItem {
        private Device device;
        private int amount;

        public CartItem(Device device, int amount) {
            this.device = device;
            this.amount = amount;
        }

        public Device getDevice() {
            return device;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }
}
