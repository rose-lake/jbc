/*
 * Modifying a while loop assignment
 * Ksenia Lake
 * October 23, 2019
 *
 * ASSIGNMENT:
 * Modify the below program to also exit the while loop if the person guesses "5".
 *
 * EXTRA:
 * Also cleaned up the code to be more consistent with print vs println and the handling of nextInt()
 */

import java.util.Scanner;

public class JavaDay3Ex2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0;  //guess is initialized to 0

        secretNumber = 5;    // originally secretNumber was set to 123

        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.println("Enter the number:");
        guess = keyboard.nextInt();
        keyboard.nextLine();

        while ( guess != secretNumber )
        {
            System.out.println("You are wrong. Try again.");
            System.out.println("Enter the number: ");
            guess = keyboard.nextInt();
            keyboard.nextLine();
        }

        System.out.println("You are correct. You win a prize!");
        keyboard.close();
    }

}
