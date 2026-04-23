package basics;

import java.util.Scanner;

public class temperature_conversion_program {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");

        // Temperature Conversion Program

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");

        // declare values
        double temperature;
        double convertedTemp;
        char choice;

        // get user input - 1.the temp value, 2.to get which conversion
        System.out.print("Enter a temperature to convert: ");
        temperature = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the conversion (F for Fahrenheit, C for Celsius): ");
        choice = scanner.nextLine().toUpperCase().charAt(0);
        
        // calculate the temperature
        convertedTemp = (choice == 'C') ? (temperature - 32) * 5/9 : (temperature * 9/5) + 32;

        // display the result
        System.out.printf("The converted temperature %.2f", convertedTemp);

        System.out.println("\n------------------------------------------");
        scanner.close();
    }
}
