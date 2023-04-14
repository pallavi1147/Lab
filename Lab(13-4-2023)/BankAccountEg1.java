package labwork;
abstract class BankAccount {
    private int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Rs" + amount + " deposited successfully."+"New balance: Rs" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Rs" + amount + " withdrawn successfully."+"New balance: Rs" + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class BankAccountEg1 {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(67891, 2000.0);
        account.deposit(700.0);
        account.withdraw(300.0);
    }
}

