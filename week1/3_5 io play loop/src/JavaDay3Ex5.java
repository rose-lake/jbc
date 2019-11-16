/*
 * Iffy Loopy Assignment
 * Ksenia Lake
 * October 23, 2019

SPECIFICATIONS:
Loopy
Create ONE string variable to store the output of 5 words that a user will enter at random.

Iffy
Set a boolean value called redEyes.
The value will depend on the value entered by the user for the question "Are your eyes red?"

Create an application that will ask,
"Are your eyes red?"
If the response is 'y', Or 'yes' (regardless of case), then your application should print out:
"Get some sleep!"

Otherwise your application should print out "You look great!"
Use the value of redEyes to determine whether the user should be complimented or not.

Iffy Loop
Make sure after the application asks the question the first time, you get a prompt asking,
"Do you want to try again?"
Your application should continue until the user enters 'n' as an answer.
 */

import java.util.Scanner;

public class JavaDay3Ex5 {
    public static void main(String[] args) {

        // declare + initialize keyboard input
        Scanner keyboard = new Scanner(System.in);

        // declarations for Loopy
        String loopyInput = "";     // initialize, too
        String userResponse;

        // Loopy
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a word: ");
            loopyInput += keyboard.nextLine();
        }
        System.out.println("You entered: " + loopyInput);

        // declarations for Iffy
        boolean redEyes;
        String tryAgain = "y";  // initialize to yes for first round

        // Iffy
        while(!tryAgain.equalsIgnoreCase("n")) {

            // set the boolean value based on user response
            System.out.println("Are your eyes red?");
            userResponse = keyboard.nextLine();
            if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
                redEyes = true;
            } else {
                redEyes = false;
            }

            // give output based on boolean value
            if (redEyes) {
                System.out.println("Get some sleep!");
            } else {
                System.out.println("You look great!");
            }

            // go again until the user says "n" (see while condition)
            System.out.println("Do you want to try again? (y/n)");
            tryAgain = keyboard.nextLine();
        }

    }

}
