/*
 * Scanner Program
 * Ksenia Lake
 * October 22, 2019
 *
 * REQUIREMENTS:
 * Input String: "P Sherman 42 Wallaby Way Sydney"
 * Variables: firstInitial, lastName, houseNumber, streetName, streetType, city
 *
 * YOUR OUTPUT: (required code):
 * System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
 * System.out.println(streetName + " " + streetType + " " + city); *
 */
import java.util.Scanner;

public class JavaDay2Ex3 {

    public static void main(String[] args) {

        // declare the variables
        String firstInitial, lastName, streetName, streetType, city;
        int houseNumber;
        // initialize the Scanner object
        Scanner keyboard = new Scanner(System.in);

        // request the required input string
        System.out.println("Please enter the required input string: ");
        firstInitial = keyboard.next();
        lastName = keyboard.next();
        houseNumber = keyboard.nextInt();
        streetName = keyboard.next();
        streetType = keyboard.next();
        city = keyboard.next();

        // Sooo interesting! Notice the difference between System.out.print() and System.out.println() !
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);

        // close the resource!
        keyboard.close();
    }
}
