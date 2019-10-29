/**
 * Full Eliza assignment
 * Ksenia Lake
 * Tuesday, October 29, 2019
 *
 * see README for project description
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class FullEliza {

    private static ArrayList<String> qualifiers = new ArrayList<>(Arrays.asList(
                                                                    "Why do you say that ",
                                                                    "You seem to think that ",
                                                                    "So, you are concerned that "));

    private static ArrayList<String> hedges = new ArrayList<>(Arrays.asList(
                                                                "Please tell me more.",
                                                                "Many of my patients tell me the same thing.",
                                                                "It is getting late, maybe we had better quit."));

    public static void main(String[] args) {

        boolean play = true;
        Scanner keyboard = new Scanner(System.in);
        String answer;
        String[] split;
        String[] response;

        // ****************************
        //  main running loop
        // ****************************
        System.out.print("Good day. What is your problem? ");
        while(true) {

            System.out.print("Enter your response here or \"Q\" to quit: ");
            answer = keyboard.nextLine();

            // if user wants to quit, break.
            if (answer.equalsIgnoreCase("q")) { break; }
            // also break on "i am feeling great"
            if (answer.equalsIgnoreCase("i am feeling great")) {
                System.out.println("So glad to hear it! We'll chat another day. Goodbye!");
                break;
            }

            // process the results and respond
            split = answer.toLowerCase().split(" ");
            System.out.println(Arrays.toString(split));
            response = processArray(split);
            respond(response);

        } // end while

    } // end main

    private static void respond(String[] response) {

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(qualifiers.size()) + 1;
        System.out.print(qualifiers(randomInt));

        for (int i=0; i < (response.length-1); i++) {   // treat all but the last element the same
            System.out.print(response[i] + " ");
        }
        System.out.print(response[(response.length-1)]);  // last element without a space after
        System.out.println("?");

    } // end respond method

    private static String[] processArray(String[] input) {

        for (int i = 0; i < input.length; i++) {
            switch(input[i]) {
                case "i":
                    input[i] = "you";
                    break;
                case "me":
                    input[i] = "you";
                    break;
                case "my":
                    input[i] = "your";
                    break;
                case "am":
                    input[i] = "are";
                    break;
            } // end switch
        } // end for

        // return modified input as the return array
        return input;

    } // end processArray method


} // end IntermediateEliza class
