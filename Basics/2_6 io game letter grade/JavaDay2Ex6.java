/*
 * Print Grades assignment
 * Ksenia Lake
 * October 22, 2019
 *

REQUIREMENT:
Write a program that uses a while loop to prompt the user
to enter any number of exam scores
and the resulting program will print out the grade, A, B, C, D or F.

EXTRA/BONUS:
If you're finished:
Modify your program to print + or - after the grade.
A+ 97 to 100
A 94 to 96
A- 90 to 93
B+ 87 to 89
B 84 to 86
B- 80 to 83
C+ 77 to 79
C 74 to 76
C- 70 to 73
D 60 to 69
Go back to School if you get below 60

HINT:
You can convert a string to an integer as follows:
String input = "99";
int score = Integer.parseInt(input);
 */

import java.util.Scanner;

public class JavaDay2Ex6 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean weAreContinuing;    // will be used to regulate our while loop
        String userResponse;        // will hold user-reponse to the question of score
        int score;                  // will be user-entered score converted to int
        String wishToContinue;      // will be user-entered y/n

        // initialize loop variable
        weAreContinuing = true;
        while (weAreContinuing) {

            System.out.println("Enter an exam score: ");
            /******************************
             * This is how to clear out the
             * new line after nextInt()
             ******************************/
            score = keyboard.nextInt();
            keyboard.nextLine();

//            // this was original code when I didn't know about keyboard.nextLine() to clear the input.
//            userResponse = keyboard.nextLine();
//            score = Integer.parseInt(userResponse);

            // VALIDATE INPUT
            if (score > 100) {
                if (score < 120) { // allow for possibility of extra credit
                    System.out.print("Congratulations! Looks like you have an A++!");
                } else { // 120 or greater is unreasonable
                    System.out.print("This value is not a reasonable exam score. Try again.");
                }
            } else if (score < 0 ) { // negative is unreasonable
              System.out.print("This value is not a reasonable exam score. Try again.");
            }
            // MAIN CODE
            else if (score >= 90) {
                System.out.print("Congratulations! You have an A");
                if (score >= 97) {
                    System.out.print("+!");
                } else if (score <= 93) {
                    System.out.print("-.");
                } else {
                    System.out.print(".");
                }
            } else if (score >= 80) {
                System.out.print("Good job! Your grade is a B");
                if (score >= 87) {
                    System.out.print("+!");
                } else if (score <= 83) {
                    System.out.print("-.");
                } else {
                    System.out.print(".");
                }
            } else if (score >= 70) {
                System.out.print("Keep trying! Your grade is a C");
                if (score >= 77) {
                    System.out.print("+!");
                } else if (score <= 73) {
                    System.out.print("-.");
                } else {
                    System.out.print(".");
                }
            } else if (score >= 60) {
                System.out.print("Your grade is a D.");
            } else {
                System.out.print("Go back to school.");
            } // end else-if

            System.out.println("\nDo you want to enter another score (Y/N)? ");
            wishToContinue = keyboard.nextLine();
            switch (wishToContinue.toLowerCase()) {
                case "y":
                case "yes":
                    weAreContinuing = true;
                    break;
                case "n":
                case "no":
                    weAreContinuing = false;
                    break;
                default:
                    System.out.println("Unknown response! Quitting program.");
                    weAreContinuing = false;
                    break;
            } //end switch
        } // end while

        // clean up before exiting main()
        keyboard.close();

    } // end main
}
