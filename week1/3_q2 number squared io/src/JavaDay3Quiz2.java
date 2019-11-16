/**
 * Loops : Quiz 2 !
 * Ksenia Lake
 * October 23, 2019
 *
 * Requirement:
 * input: user specified number
 * output: a table displaying numbers from 1 to the user specified number AND each number's square.
 * Format nicely. ASCII art ;)
 */

import java.util.Scanner;

public class JavaDay3Quiz2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int userInt;

        // get user input
        System.out.println("Please enter a POSITIVE INTEGER: ");
        userInt = keyboard.nextInt();
        keyboard.nextLine();

        // lay out the table headers
        System.out.println("Number\t\tSquare");
        System.out.println("--------\t--------");

        // run the loop
        for (int i = 1; i <= userInt; i++) {
            System.out.println(i + "\t\t\t" + (i*i));
        }

        // exit cleanly
        System.out.println("Thanks for your input!");
        keyboard.close();

    }
}
