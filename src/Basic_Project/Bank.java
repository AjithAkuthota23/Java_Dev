package Basic_Project;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    // Add new account
    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account created successfully!");
    }

    // Find account by account number
    public BankAccount findAccount(int accountNumber) throws Exception {
        for(BankAccount acc : accounts) {
            if(acc.getAccountNumber() == accountNumber) return acc;
        }
        throw new Exception("Account not found");
    }

    // Display all accounts
    public void displayAllAccounts() {
        for(BankAccount acc : accounts) {
            acc.display();
        }
    }
}
