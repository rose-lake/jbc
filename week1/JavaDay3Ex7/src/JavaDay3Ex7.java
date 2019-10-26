/**
 * Guessing Game, with Random number generator
 * Ksenia Lake
 * October 23, 2019
 *
 * This code fulfils the requirements for 'Guessing Game', described here:
 *
 * I'm thinking of a number. Guess it.
 * If you've ever played that game or some version of it you're ready for the next assignment.
 * The computer will "pick" a number. Actually, you'll program one in the code.
 * You can use a random number if you're ambitious.
 *
 * Create a number-guessing game using a while-loop.
 * The loop will allow users to guess until they get the number right.
 * Your program will keep looping as long as the guess is different from the secret number.
 *
 * The output should look like this: (Secret number = 6)
 *
 * I have chosen a number between 1 and 10. Try to guess it.
 * Your guess: 5
 * That is incorrect. Guess again.
 * Your guess: 8
 * That is incorrect. Guess again.
 * Your guess: 6
 * That's right! You're a good guesser.
 *
 */

import java.util.Scanner;
import java.util.Random;

public class JavaDay3Ex7 {

    public static void main(String[] args) {

        // DECLARE and INITIALIZE

        // range variables
        int start = 5, end = 11;

        // the random number and the user's guess
        int randomNum, userGuess;

        // declare and initialize random number generator
        Random randomGenerator = new Random();

        // declare and initialize the Scanner
        Scanner keyboard = new Scanner(System.in);

        // generate random number in range [start, end] inclusive.
        randomNum = randomGenerator.nextInt((end-start)+1) + start;


        // THE INTERACTIVE PART

        // request user's Guess
        System.out.println("I have chosen a number between " + start + " and " + end + ". Try to guess it.");
        userGuess = keyboard.nextInt();
        keyboard.nextLine();

        // keep asking for Guesses as long as the user hasn't guessed right!
        while (userGuess != randomNum) {
            System.out.println("Your guess: " + userGuess);
            System.out.println("That is incorrect. Guess again.");
            userGuess = keyboard.nextInt();
            keyboard.nextLine();
        }  // if we break out of the while, it means userGuess == randomNum !!!

        // The user guessed right! Congratulate the user and exit cleanly
        System.out.println("Your guess: " + userGuess);
        System.out.println("That's right! You're a good guesser.");
        keyboard.close();

    }

}
