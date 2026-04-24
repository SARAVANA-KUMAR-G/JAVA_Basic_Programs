package basics;

import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String[] args) {
        System.out.println();

        // Number Guessing Game

        // declare variables
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;
        int randomNumber;

        // welcome message
        System.out.println("Number Guessing Game");

        // generate the random number
        randomNumber = random.nextInt(1, 101);
        System.out.println("Enter a number between 1-100 : ");

        do{
            // get the guess from user
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            // check for match 1.if guess is greater,print TOO HIGH; 2.if guess is lower,print TOO LOW; 3.Congrats
            if(guess > randomNumber){
                System.out.println("TOO HIGH!");
            }
            else if(guess < randomNumber){
                System.out.println("TOO LOW!");
            }
            else{
                // display ending
                System.out.println("Congrats!, the number is " + randomNumber);
                System.out.println("Total Attempts: "+ attempts);
            }
        }while(guess != randomNumber);

        System.out.println();
        scanner.close();
    }
}