/*
 * Loop Completion activity
 * Ksenia Lake
 * October 23, 2019
 *
 * ASSIGNMENT:
 * The following program should allow the user to input 10 integers and output the total.
 */

import java.util.Scanner;

public class JavaDay3Ex4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;    // note: this initializes only the total variable, not the num variable.

        // getting user input
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter integer #" + (i+1));
            num = keyboard.nextInt();
            keyboard.nextLine();
            total += num;
        }

        // final output
        System.out.println("Thank you!");
        System.out.println("The total sum of all 10 numbers you entered is " + total);

        // exit cleanly
        System.out.println("Goodbye!");
        keyboard.close();

    }

}
