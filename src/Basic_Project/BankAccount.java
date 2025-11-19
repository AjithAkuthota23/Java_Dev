package Basic_Project;

class BankAccount {
    private final int accountNumber; // cannot change
    private String accountHolder;
    private double balance;
    private static int accountCounter = 1000; // static for unique account numbers

    // Constructor
    public BankAccount(String name, double initialBalance) {
        this.accountNumber = ++accountCounter;
        this.accountHolder = name;
        this.balance = initialBalance;
    }

    // Getter methods
    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    // Deposit
    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw
    public void withdraw(double amount) throws Exception {
        if(amount <= 0) throw new Exception("Invalid withdrawal amount");
        if(amount > balance) throw new Exception("Insufficient balance");
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    // Display info
    public void display() {
        System.out.println("Account No: " + accountNumber +
                ", Name: " + accountHolder +
                ", Balance: $" + balance);
    }
}
