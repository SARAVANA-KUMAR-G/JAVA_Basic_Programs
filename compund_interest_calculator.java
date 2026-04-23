package basics;

import java.util.Scanner;

public class compund_interest_calculator {
    public static void main(String[] args) {
        System.out.printf("\n");

        // Compound Interest Calculator Program
        Scanner scanner = new Scanner(System.in);

        // declare values
        double principal;
        double interestRate;
        int compoundingFrequency;
        double years;
        double amount;

        // get user input
        System.out.print("Enter the Principal Amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the Interest rate(in percentage): ");
        interestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the Compound Frequency: ");
        compoundingFrequency = scanner.nextInt();

        System.out.print("How many years you want?: ");
        years = scanner.nextDouble();

        // calculate the CI
        amount = principal * Math.pow((1 + (interestRate/compoundingFrequency)), (compoundingFrequency * years));

        // display the result
        System.out.printf("Your total returns is Rs.%.2f", amount);

        System.out.printf("\n");
        scanner.close();
    }
}
