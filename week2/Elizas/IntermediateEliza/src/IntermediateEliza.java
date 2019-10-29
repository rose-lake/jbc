/**
 * Intermediate Eliza assignment
 * Ksenia Lake
 * Tuesday, October 29, 2019
 *
 * see README for project description
 */

import java.util.Scanner;
import java.util.Arrays;


public class IntermediateEliza {

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

            // break on "q" or "i am feeling great"
            if (answer.equalsIgnoreCase("q") || answer.equalsIgnoreCase("i am feeling great")) { break; }

            // process the results and respond
            split = answer.toLowerCase().split(" ");
            System.out.println(Arrays.toString(split));
            response = processArray(split);
            respond(response);
        } // end while

    } // end main

    private static void respond(String[] response) {
        System.out.print("Why do you say that ");
        for (int i=0; i < response.length; i++) {
            System.out.print(response[i] + " ");
        }
        System.out.println("?");
    }

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
