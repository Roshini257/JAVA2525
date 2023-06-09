import org.springframework.stereotype.Component;

@Component
public class Account {
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private String accountNumber;
    private double balance;

    // Constructors, getters, and setters
}

