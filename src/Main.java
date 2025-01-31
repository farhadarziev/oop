import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cars you want to create: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Car> cars = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            System.out.println("Write the info for car " +(i+1));
            System.out.print("Model: ");
            String model = scanner.nextLine();

            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Color: ");
            String color = scanner.nextLine();

            System.out.print("Price: ");
            int price = scanner.nextInt();
            scanner.nextLine();

            Car car = new Car(model, year, color, price);
            cars.add(car);
        }

        System.out.println("Car info: ");
        for (Car car : cars) {
            System.out.println(car.displayInfo());
        }

        for (Car car : cars) {
            System.out.println("Methods of Car " + car.getModel() + ":");
            car.startEngine();
            car.move();
            car.stopEngine();
        }

        scanner.close();
        }

    }
