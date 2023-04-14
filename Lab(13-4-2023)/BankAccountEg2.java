package labwork;

//Define the BankAccount interface
interface BankAccountt {
void deposit(double amount);
void withdraw(double amount);
}

//Implement the CheckingAccount class which implements the BankAccount interface
class CheckingAccountt implements BankAccountt {
private double balance = 0; // initialize the balance to zero

//Implement the deposit method from BankAccount interface
public void deposit(double amount) {
 balance += amount; // add the deposited amount to the balance
 System.out.println("Rs " + amount + " deposited. New balance is Rs" + balance);
}

//Implement the withdraw method from BankAccount interface
public void withdraw(double amount) {
 if (balance >= amount) {
    balance -= amount; // subtract the withdrawal amount from the balance
    System.out.println("Rs " + amount + " withdrawn. New balance is Rs" + balance);
 } 
 else {
    System.out.println("Insufficient balance. Withdrawal not possible.");
 }
}
}

//Create an object of the CheckingAccount class and call the deposit and withdraw methods
class BankAccountEg2  {
public static void main(String[] args) {
 CheckingAccountt account = new CheckingAccountt();
 account.deposit(700);
 account.withdraw(300);
}
}

