/*
 * What If Completion assignment
 * Ksenia Lake
 * October 22, 2019
 *
 * REQUIREMENT:
 * Create a program that will output the sum, product, and average of num1 and num2.
 * If the calculated sum is over 200, print an asterisk next to (after) the sum.
 *
 * BONUS:
 * If the calculated sum is under 1000, it should have a tilde (~) printed next to (after) it.
 */

import java.util.Scanner;

public class JavaDay2Ex7 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        String answer;
        int product, sum;
        double average;

        do {
            System.out.println("Enter the first number: ");
            num1 = keyboard.nextInt();
            keyboard.nextLine();

            System.out.println("Enter the second number: ");
            num2 = keyboard.nextInt();
            keyboard.nextLine();

            // perform calculations
            sum = num1 + num2;
            product = num1 * num2;
            average = (num1 + num2) / 2.0;

            // print outputs

            // printing sum, with conditions
            System.out.print("The sum of " + num1 + " and " + num2 + " is " + sum);
            if (sum > 200) {
                System.out.print("*");
                if (sum < 1000) { // could be both > 200 and < 1000
                    System.out.print("~");
                }
            } else if (sum < 1000) { // sum may be negative
                System.out.print("~");
            }
            System.out.println(".");  // use println to finish the line.

            // printing product and average
            System.out.println("The product of " + num1 + " and " + num2 + " is " + product + ".");
            System.out.println("The average of " + num1 + " and " + num2 + " is " + average + ".");

            System.out.println("Do you want to play again? (yes/no)");
            answer = keyboard.nextLine();

        } while (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"));

        // clean exit
        System.out.println("Thanks for playing!");
        keyboard.close();

    }

}
