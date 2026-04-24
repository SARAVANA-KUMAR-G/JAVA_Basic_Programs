package basics;

import java.util.Random;
import java.util.Scanner;

public class dice_roller_program {
    public static void main(String[] args) {
        System.out.println();

        // Dice Roller Program

        // declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int noOfDice;
        int total = 0;

        // get the no.of dice to roll from user
        System.out.println("Dice Roller Program:");
        System.out.print("Enter the no.of dice to be rolled: ");
        noOfDice = scanner.nextInt();

        if(noOfDice < 0){
            System.out.println("Enter a valid number!");
        }

        // display each of the rolled dice's values
        for(int i = 0; i < noOfDice; i++){
            int roll = random.nextInt(1,7);
            displayDie(roll);
            System.out.print("Rolled Dice: " + roll + "\n");
            total += roll;
        }

        // display their total
        System.out.println("Total: " + total);

        // display ASCII fig of each dice

        System.out.println();
        scanner.close();
    }
    static void displayDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid number!");
        }
    }

}
