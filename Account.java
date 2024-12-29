import java.time.LocalDate;
import java.util.Scanner;

public class Account {
    private long accountNumber;
    private double initialBalance;
    private LocalDate creationDate;
    private Client clients;


    static Scanner scanner = new Scanner(System.in);

    public Account(long accountNumber, double initialBalance, LocalDate creationDate, Client clients) {
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
        this.clients = clients;
        this.creationDate = creationDate;
    }

    public Account() {

    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setAccountNumber() {
        this.accountNumber = accountNumber;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }


    public Client getClients() {
        return clients;
    }

    public void setClients(Client clients) {
        this.clients = clients;
    }
    