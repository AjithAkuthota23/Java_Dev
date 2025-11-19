package Basic_Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Display All Accounts\n5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            try {
                switch(choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        sc.nextLine(); // consume newline
                        String name = sc.nextLine();
                        System.out.print("Initial deposit: ");
                        double amount = sc.nextDouble();
                        BankAccount account = new BankAccount(name, amount);
                        bank.addAccount(account);
                        break;

                    case 2:
                        System.out.print("Enter account number: ");
                        int accNo = sc.nextInt();
                        BankAccount acc = bank.findAccount(accNo);
                        System.out.print("Deposit amount: ");
                        double dep = sc.nextDouble();
                        acc.deposit(dep);
                        break;

                    case 3:
                        System.out.print("Enter account number: ");
                        int accNo2 = sc.nextInt();
                        BankAccount acc2 = bank.findAccount(accNo2);
                        System.out.print("Withdraw amount: ");
                        double wd = sc.nextDouble();
                        acc2.withdraw(wd);
                        break;

                    case 4:
                        bank.displayAllAccounts();
                        break;

                    case 5:
                        System.out.println("Thank you for using the bank app!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option");
                }
            } catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
