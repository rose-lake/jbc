/*
 * Switch statement assignment
 * Ksenia Lake
 * October 23, 2019
 *
 * REQUIREMENTS:
 * Write a program using a switch statement to print the month names given the exact number of days in the month.
 * If the user enters 30 then the program will display: "September April June November".
 * If the user enters 9 then program will alert the user that no months have exactly 9 days.
 */

import java.util.Scanner;

public class JavaDay3Ex1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userInput;
        String wantToPlay;

        System.out.println("This program will tell you the possible month given the total number of days in the month!");

        do {
            // take in user input
            System.out.println("Please enter the number of days in the month: ");
            userInput = keyboard.nextInt();
            keyboard.nextLine();

            // generate output
            switch (userInput) {
                case 30 :
                    System.out.println("The possible months are: April, June, September, November.");
                    break;
                case 31 :
                    System.out.println("The possible months are: January, March, May, July, August, October, December.");
                    break;
                case 28 :
                case 29 :
                    System.out.println("The possible month is February.");
                    break;
                default :
                    System.out.println("That was not a valid number for the total days in a month.");
            }

            // see if user wants to play again
            System.out.println("Would you like to play again? (yes/no)");
            wantToPlay = keyboard.nextLine();

        } while (wantToPlay.equalsIgnoreCase("yes") || wantToPlay.equalsIgnoreCase("y"));

        // close cleanly
        System.out.println("Thanks for playing!");
        keyboard.close();

    } // end main

}
