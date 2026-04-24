package basics;

import java.util.Scanner;

public class banking_program {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();

        // Simple Banking Program

        // declare variables
        double balance = 0;
        int choice;
        boolean isRunning = true;

        while(isRunning){ // to run until exiting

            // print welcome message
            System.out.println("***********************");
            System.out.println("Banking Program");
            System.out.println("***********************");
            System.out.println("1. Check Balance");
            System.out.println("2. Make a Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***********************");
            System.out.print("Enter your choice [1-4]: ");
            choice = scanner.nextInt();
            System.out.println("***********************");
        
            // give user choice to select (Balance, Deposit, Withdraw, Exit)
            switch (choice) {
            case 1 -> System.out.println("Balance: " + checkBalance(balance)); // Check balance()
            case 2 -> balance += makeDeposit(); // Deposit()
            case 3 -> balance -= makeWithdraw(balance); // Withdraw()
            case 4 -> isRunning = false; // Exit
            default -> System.out.println("Enter a valid choice!");
            }
        }

        // End message
        System.out.println("Thank You! Have a nice day! :))");

        System.out.println();
        scanner.close();
    }
    static double checkBalance(double balance){
        return balance;
    }
    static double makeDeposit(){

        System.out.print("Enter an amount to be deposited: ");
        double amount = scanner.nextDouble();
        
        if(amount < 0){
            System.out.println("\nAmount cannot be negative!");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double makeWithdraw(double balance){
        double amount;
        System.out.print("Enter an amount to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient Balance!");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount cannot be negative!");
            return 0;
        }
        else{
            return amount;
        }
    }
}
