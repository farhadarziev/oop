import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();
        PersonalAccount account = new PersonalAccount(accountNumber, accountHolder);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Transaction History\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    account.printTransactionHistory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

}