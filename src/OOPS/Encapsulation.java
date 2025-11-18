package OOPS;

public class Encapsulation {
    public static void main(String[] args) {
        // Binding data and methods together and hiding internal details using private variables and public getters and setters
        // Real World: ATM machine will have buttons using which you will get balance
        Bank bank = new Bank();
        bank.deposit(1000);
        System.out.println(bank.getBalance());
    }
}

class Bank{
    private double balance; // hidden data

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance; // controlled access
    }
}
