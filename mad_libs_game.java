package basics; // My Package
import java.util.Scanner;

public class mad_libs_game {
    public static void main(String[] args) {
        System.out.println("");

        // Madlibs Game

        Scanner scanner = new Scanner(System.in);

        String noun1;
        String adjective1;
        String verb1;
        String verb2;
        String noun2;
        String adjective2;

        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Enter a adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();

        System.out.print("Enter another verb: ");
        verb2 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun2 = scanner.nextLine();
        
        System.out.print("Enter a adjective: ");
        adjective2 = scanner.nextLine();

        System.out.println("");
        System.out.println("Hi, I am " + noun1 + " with " + adjective1 + " hair.");
        System.out.println(noun1 + " " + verb1 + " some food to " + verb2 + ".");
        System.out.println("It can be a " + noun2 + " which should be " + adjective2 + ".");

        System.out.println("");
        scanner.close();
    }
}
