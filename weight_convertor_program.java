package basics;

import java.util.Scanner;

public class weight_convertor_program {
    public static void main(String[] args) {
        System.out.println("");

        // Weight Convertor Program
        // lbs - kgs : kg = lbs * 0.45359237
        // kgs - lbs : lb = kg * 2.20462

        Scanner scanner = new Scanner(System.in);
        
        // declare values
        double userWeigth;
        int option;
        double convertedResult;

        //  Welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("1. For pounds(lbs) to kilos(kgs)");
        System.out.println("2. For kilos(kgs) to pounds(lbs)");

        // get user input
        System.out.print("Enter a weight to convert: ");
        userWeigth = scanner.nextDouble();

        System.out.print("Select an option: ");
        option = scanner.nextInt();

        // calculate the weight by each options
        if(option == 1){
            // kg = lbs * 0.45359237
            convertedResult = userWeigth * 0.45359237;
            System.out.printf("\n%.2flbs in kilogram is %.2fkg", userWeigth, convertedResult);
        }
        else if(option == 2){
            // lb = kg * 2.20462
            convertedResult = userWeigth * 2.20462;
            System.out.printf("\n%.2fkg in pounds is %.2flbs", userWeigth, convertedResult);
        }
        else{
            System.out.println("\nPlease enter a valid option!");
        }
        

        System.out.println("\n");
        scanner.close();
    }
}
