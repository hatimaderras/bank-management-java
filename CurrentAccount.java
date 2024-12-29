import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class CurrentAccount extends Account {
    static int  bankCharges = 100;
    private Client clients;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<CurrentAccount> currentAccount = new ArrayList<>();

    public CurrentAccount(long accountNumber, double initialBalance, LocalDate creationDate, Client clients) {
        super(accountNumber, initialBalance, creationDate, clients);
        this.clients = clients;
    }

    public CurrentAccount(Client clients) {
        this.clients = clients;
    }

    public CurrentAccount() {
        super();
    }

    public int  getBankCharges() {
        return bankCharges;
    }

    public void setBankCharges(int bankCharges) {
        this.bankCharges = bankCharges;
    }
    