/**
 * JBC Week 1 Challenge
 * Ksenia Lake
 * October 24, 2019
 */

import java.util.Scanner;
import java.util.Random;

public class JavaWeek1Challenge {
    public static void main(String[] args) {

        /* *************************
         *  variable declarations
         * ************************/
        Scanner keyboard = new Scanner(System.in);      // keyboard scanner used throughout
        boolean isPrime;                                // prime-checking control flag

        int userInt;                                    // user inputted number
        String userChoice;                              // holds user responses

        Random randomGenerator = new Random();          // random number generator
        int start = 1, end = 250;                       // RANGE for random number generator
        int randomInt;                                  // randomly generated integer

        boolean playAgain = false;                      // control flag to play game again
        boolean validChoice;                            // control flag (validate user response)


        // welcome to the game!
        System.out.println("Hello! Welcome to the prime number game!");

        /* *************************************************
         *  wrapper 2: give option to play again : do-while
         * *************************************************/
        do {
            /* **********************************************
             *  wrapper 1: ask user to choose part 1 or part 2
             * *********************************************/
            System.out.println("Would you like to input your own number (\"I\") or have the program generate a random number (\"R\")?" );

            userChoice = keyboard.nextLine();

            if(userChoice.equalsIgnoreCase("i")) {

                /* *****************************
                 *            PART 1
                 * ****************************/
                // request user input
                System.out.println("Please enter an integer greater than 1.");
                userInt = keyboard.nextInt();
                keyboard.nextLine();

                if (userInt > 1) {  // validate input

                    if (userInt == 2) { // TWO is a SPECIAL CASE!
                        System.out.println(userInt + " is prime!");
                    }
                    else { // userInt > 2; CHECK IF PRIME

                        isPrime = true;   // set flag to true -- our loop will check for false condition

                        for (int i = 2; i <= (userInt / 2); i++) {  // only check up to userInt/2 (integer division is okay)
                            if (userInt % i == 0){
                                System.out.println(userInt + " is not a prime number.");
                                isPrime = false;
                                break;
                            }
                        } // end prime-checking loop

                        // if we have gotten this far and the flag is still true, no number could divide userInt, it is Prime.
                        if (isPrime) {
                            System.out.println(userInt + " is prime!");
                        }

                    } // end 2-not2 if-else

                } else { // user input was not an integer > 1
                    System.out.println("That was not a valid input.");
                }


            } else if(userChoice.equalsIgnoreCase("r")) {

                /* *****************************
                 *           PART 2
                 * ****************************/
                // greet the user
                System.out.println("The program will now generate a random number between " + start + " and " + end + " and check if it is prime.");

                // generate a random number in RANGE
                randomInt = randomGenerator.nextInt((end - start) + 1) + start;

                if (randomInt == 2) { // TWO is a SPECIAL CASE!
                    System.out.println(randomInt + " is prime!");
                } else { // userInt > 2; CHECK IF PRIME

                    isPrime = true;   // set flag to true -- our loop will check for false condition

                    for (int i = 2; i <= (randomInt / 2); i++) {  // only check up to userInt/2 (integer division is okay)
                        if (randomInt % i == 0) {
                            System.out.println(randomInt + " is not a prime number.");
                            isPrime = false;
                            break;
                        }
                    } // end prime-checking loop

                    // if we have gotten this far and the flag is still true, no number could divide randomInt, it is Prime.
                    if (isPrime) {
                        System.out.println(randomInt + " is prime!");
                    }

                } // end 2-not2 if-else

            } else {
                System.out.println("That was not a valid choice.");
            }

            /* **********************************************************
             *  ask user if they want to play again
             *  validate their answer to be ignorecase(y | yes | n | no)
             *  keep asking until valid response
             * **********************************************************/
            validChoice = false;
            while(!validChoice) {
                System.out.println("Would you like to play again? (Y/N) ");
                userChoice = keyboard.nextLine();
                if (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")) {
                    playAgain = true;
                    validChoice = true;
                }
                else if (userChoice.equalsIgnoreCase("n") || userChoice.equalsIgnoreCase("no")) {
                    playAgain = false;
                    validChoice = true;
                }
                else {
                    System.out.println("Please enter a valid choice.");
                }
            }

        } while (playAgain);

        /* *****************************
         *       Clean-Up and Exit
         * ****************************/
        System.out.println("Thanks for playing!");
        keyboard.close();

    }  // end main
}
