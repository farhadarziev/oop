package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input  name: ");
        String name = scanner.nextLine();

        System.out.print("Input surname: ");
        String surname = scanner.nextLine();

        System.out.print("INput birthday(yyyy-MM-dd): ");
        String birthDateStr = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(birthDateStr);

        int userId = UserUtil.generateUserId();
        String email = UserUtil.generateEmail(name, surname, "example.com");
        String password = UserUtil.generatePassword();

        User user = new User(userId, name, surname, email, password, birthday);
        UserService.addUser(user);

        System.out.println("User has created!");
        System.out.println(user.getDetails());

        boolean running = true;

        while (running) {

            System.out.println("Chose the option:");
            System.out.println("1.Create a new user");
            System.out.println("2. Find the user");
            System.out.println("3. Remove the user");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Input name: ");
                    name = scanner.nextLine();

                    System.out.print("Input surname: ");
                    surname = scanner.nextLine();

                    System.out.print("Input birthday(yyyy-MM-dd): ");
                    birthDateStr = scanner.nextLine();
                    birthday = LocalDate.parse(birthDateStr);

                    userId = UserUtil.generateUserId();
                    email = UserUtil.generateEmail(name, surname, "example.com");
                    password = UserUtil.generatePassword();

                    user = new User(userId, name, surname, email, password, birthday);
                    UserService.addUser(user);

                    System.out.println("New user has created!");
                    System.out.println(user.getDetails());
                    break;

                case 2:

                    System.out.print("Input the userId for searching: ");
                    int searchId = scanner.nextInt();
                    User foundUser = UserService.findUser(searchId);

                    if (foundUser != null) {
                        System.out.println("User has found: ");
                        System.out.println(foundUser.getDetails());
                    } else {
                        System.out.println("user not found: ");
                    }
                    break;

                case 3:

                    System.out.print("Input the useriId for deleting: ");
                    int deleteId = scanner.nextInt();
                    boolean deleted = UserService.deleteUser(deleteId);

                    if (deleted) {
                        System.out.println("User has removed.");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Incorrect choice. Try again");
            }
        }

        scanner.close();
    }
}
