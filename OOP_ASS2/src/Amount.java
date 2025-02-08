import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Amount {
    private double amount;
    private LocalDateTime dateTime;
    private String transactionType;

    public Amount(double newAmount, String newTransactionType) {
        amount = newAmount;
        this.dateTime = LocalDateTime.now();
        transactionType = newTransactionType;
    }
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return transactionType + ": " + amount + " | " + dateTime.format(formatter);
    }


}

