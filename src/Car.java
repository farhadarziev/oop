public class Car {
    private String model;
    private int year;
    private String color;
    private int price;

    public Car(String newModel, int newYear, String newColor, int newPrice) {
        model = newModel;
        year = newYear;
        color = newColor;
        price = newPrice;
    }

    public Car(){
        this.model = null;
        this.year = 0;
        this.color = null;
        this.price = 0;
    }

    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }


    public String displayInfo (){
        return String.format("Model: %s, Year: %d, Color: %s, Price: %d$", getModel(), getYear(), getColor(), getPrice());
    }

    public void startEngine(){
        System.out.println("Car's engine started");
    }
    public void move(){
        System.out.println("Car is moving");
    }
    public void stopEngine(){
        System.out.println("Car stopped");
    }
}
