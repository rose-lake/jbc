/**
 * Simple Eliza assignment
 * Ksenia Lake
 * Tuesday, October 29, 2019
 *
 * see README for project description
 */

import java.util.Scanner;

public class SimpleEliza {

    public static void main(String[] args) {

        boolean play = true;
        Scanner keyboard = new Scanner(System.in);
        String answer;

        // ****************************
        //  main running loop
        // ****************************
        System.out.print("Good day. What is your problem? ");
        while(true) {

            System.out.print("Enter your response here or \"Q\" to quit: ");

            answer = keyboard.nextLine();

            System.out.println(answer);

            if (answer.equalsIgnoreCase("q") || answer.equalsIgnoreCase("i am feeling great")) {
                break;
            }
        }
        System.out.println(">>> END");

    }

}
