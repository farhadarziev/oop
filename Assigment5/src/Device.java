public class Device {
    private String name;
    private double price;
    private int stock;
    private  int warrantyPeriod;

    public Device(String newName, double newPrice, int newStock, int newWarrantyPeriod) {
        name = newName;
        price = newPrice;
        stock = newStock;
        warrantyPeriod = newWarrantyPeriod;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("WarrantyPeriod: " + warrantyPeriod + " months");
    }

    public boolean isAvailable(int amount) {
        return stock >= amount;
    }

    public void reduceStock(int amount) {
        if (isAvailable(amount)) {
            stock -= amount;
        } else {
            System.out.println("Not enough goods in stock.");
        }
    }

    @Override
    public String toString() {
        return name + " - " + price + " som.  " + stock ;
    }

}
