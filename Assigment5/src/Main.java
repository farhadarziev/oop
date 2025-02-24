import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Device> devices = new ArrayList<>();

        devices.add(new Smartphone("iPhone 14", 999.99, 5, 12, 6.1, 90));
        devices.add(new Smartphone("Samsung Galaxy S22", 799.99, 10, 24, 6.5, 72));
        devices.add(new Smartphone("Google Pixel 7", 599.99, 8, 18, 6.3, 39));
        devices.add(new Smartphone("Xiaomi 12", 499.99, 15, 12, 6.2, 55));
        devices.add(new Smartphone("OnePlus 10", 699.99, 7, 8, 6.7, 63));
        devices.add(new Smartphone("Huawei P50", 799.99, 12, 18, 6.4, 81));
        devices.add(new Smartphone("Sony Xperia 5", 899.99, 4, 12, 6.5, 78));

        devices.add(new Laptop("MacBook Pro", 1999.99, 3, 24, 16, 3.2));
        devices.add(new Laptop("Dell XPS 15", 1499.99, 5, 36, 32, 3.1));
        devices.add(new Laptop("HP Spectre x360", 1299.99, 6, 24, 16, 2.9));
        devices.add(new Laptop("Lenovo ThinkPad X1", 1599.99, 8, 36, 32, 3.3));
        devices.add(new Laptop("Asus ROG Zephyrus", 1899.99, 4, 24, 64, 3.6));
        devices.add(new Laptop("Acer Predator Helios", 1699.99, 7, 12, 32, 3.5));
        devices.add(new Laptop("Microsoft Surface Laptop", 1399.99, 9, 24, 16, 2.8));

        devices.add(new Tablet("iPad Pro", 1099.99, 10, 24, "2732x2048", 0.7));
        devices.add(new Tablet("Samsung Galaxy Tab S8", 899.99, 12, 24, "2560x1600", 0.6));
        devices.add(new Tablet("Lenovo Tab P12 Pro", 799.99, 8, 18, "2560x1600", 0.65));
        devices.add(new Tablet("Microsoft Surface Pro", 1299.99, 5, 36, "2880x1920", 0.75));
        devices.add(new Tablet("Huawei MatePad Pro", 699.99, 15, 12, "2560x1600", 0.68));
        devices.add(new Tablet("Xiaomi Pad 5", 499.99, 20, 12, "2560x1600", 0.69));

        System.out.println("Welcome to our Electronic Device Shop!\n");
        System.out.println("Here are our sevices: ");
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1. Show Devices");
            System.out.println("2. Show Cart");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Available devices:");
                    for (int i = 0; i < devices.size(); i++) {
                        Device device = devices.get(i);
                        System.out.println((i + 1) + ". " + device.getName() + " - $" + device.getPrice() + " (Stock: " + device.getStock() + ")");
                    }
                    System.out.print("Choose a device to add to cart: ");
                    int deviceChoice = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    if (deviceChoice >= 1 && deviceChoice <= devices.size()) {
                        Device selectedDevice = devices.get(deviceChoice - 1);
                        if (selectedDevice.getStock() >= quantity) {
                            cart.addDevice(selectedDevice, quantity);
                            System.out.println("Added to cart!");
                        } else {
                            System.out.println("Not enough stock.");
                        }
                    } else {
                        System.out.println("Invalid device choice.");
                    }
                    break;

                case 2:
                    cart.printItems();
                    break;

                case 3:
                    System.out.println("Exiting");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
