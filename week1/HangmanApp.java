/* Simple Hangman
* Ksenia Lake
* October 27, 2019
*/

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HangmanApp {

    public static void main(String[] args) {

        // initialize the word list
        ArrayList<String> words = new ArrayList<>(Arrays.asList("tree",
                                                                "rain",
                                                                "bear",
                                                                "encourage",
                                                                "promise",
                                                                "soup",
                                                                "chess",
                                                                "insurance",
                                                                "pancakes",
                                                                "stream"));

        // declare + initialize
        Scanner keyboard = new Scanner(System.in);
        Random rGenerator = new Random();
        int randomIndex, numWrong, length;
        String word, stringGuess;
        char[] hangman, charArrayGuess;
        ArrayList<Boolean> flags = new ArrayList<>();
        boolean thisGuess;

        // randomly choose the word to play
        randomIndex = rGenerator.nextInt(words.size());
        word = words.get(randomIndex);
        hangman = word.toCharArray();

        System.out.println("Welcome! Let's play hangman!\n");
        System.out.print("Here is the word I am thinking of: ");
        for (char letter : hangman) {
            System.out.print("_" + " ");
        }
        System.out.print("\n\n");

        // initialize guessing variables
        numWrong = 0;
        length = hangman.length;
        for (int i = 0; i < length; i++) {
            flags.add(false);
        }

        // // **********************************
        // // testing code
        // // **********************************
        System.out.println("shhhhhhh! " + word + " shhhhhhh!");
        // System.out.println(flags);
        // System.out.println("length of flags is : " + flags.size());
        // System.out.println("length of hangman is : " + hangman.length);
        // System.out.println("\n");
        // // **********************************

        // run the game loop.
        // break on win.
        // control loop on number of wrong guesses.
        boolean youWin = false;
        do {
            System.out.print("Enter letter or word guess: ");
            stringGuess = keyboard.nextLine();
            charArrayGuess = stringGuess.toCharArray();

            // *****************************************************
            // case 1: invalid entry.
            // user hit enter instead of guessing a char or a word
            // *****************************************************
            if (charArrayGuess.length == 0) {
                System.out.println("You did not enter a letter or a word... Try again!");
                continue;
            }

            // *****************************************************
            // case 2: single character guess.
            // *****************************************************
            else if (charArrayGuess.length == 1) {

                // compare guessed character to *every* character in hangman
                // for each correct match, set corresponding flag in flags ArrayList.
                // assume guess is false until proven true
                thisGuess = false;
                for (int i = 0; i < length; i++) {
                    if (charArrayGuess[0] == hangman[i]) {
                        flags.set(i, true);     // set flag for that position to true
                        thisGuess = true;       // remember that there was a correct guess this turn
                    }
                }

                // first, check to see if they've won!
                // .indexOf will return a negative value if no instance of false is found.
                // break on win.
                if (flags.indexOf(false) < 0) {
                    youWin = true;
                    break;
                }

                // second, check to see if we must print a "wrong guess message"
                // also it's convenient to print the last guess message here, too, if appropriate.
                if (!thisGuess) {  // thisGuess is true if you guessed right on this turn.
                    numWrong++;
                    System.out.println("You have guessed incorrectly " + numWrong + "/6 times.");
                }

            }

            // *****************************************************
            // case 3: full word guess.
            // *****************************************************
            else if (charArrayGuess.length > 1) {
                if (stringGuess.equalsIgnoreCase(word)) {
                    youWin = true;
                    break;
                }
                else {
                    numWrong++;
                    System.out.println("You have guessed incorrectly " + numWrong + "/6 times.");
                }
            } // end case 3.

            // if they're going to keep on playing,
            // print out their current guess.
            // this should execute whether they've guessed a char or a word.
            if (numWrong < 6) {
                System.out.print("Your guess so far: ");
                for (int i = 0; i < length; i++) {
                    if (flags.get(i) == true) {
                        System.out.print(hangman[i] + " ");
                    }
                    else {
                        System.out.print("_" + " ");
                    }
                }
                System.out.print("\n\n");
            }

        } while (numWrong < 6);      // end do-while.

        // to exit the loop,
        // either the user won and we hit a 'break' statement and set the youWin flag,
        // or the user guessed wrong too many times and the loop condition was not met.

        // check if they've won ::
        if (youWin) {
            System.out.println("\nYou've won! The word was " + word + ".");
        }
        // otherwise, they ran out of guesses ::
        else {
            System.out.println("Sorry, you have no more guesses left. The word was " + word + ".");
        }

        // exit cleanly
        System.out.println("\nThank you for playing!\n");
        keyboard.close();

    }
}
