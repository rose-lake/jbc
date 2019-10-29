/**
 * Ksenia Lake
 * October 26, 2019
 * Write a program that will find the length of an input string without using the library function.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Ex2{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userStr;
        char[] charArray;
        int counter = 0;
        char testChar;

        System.out.println("Please enter a string: ");
        userStr = keyboard.nextLine();
        charArray = userStr.toCharArray();

        try {
            // write an infinite loop
            for (int i = 0; i >= 0; i++) {
                // this will throw an exception when we try to access out of bounds
                testChar = charArray[i];
                counter++;
            }
        } catch (Exception e) {
            // this is where we've gone out of bounds on the charArray
            // counter was incremented after last successful access, so counter is already = length.
            System.out.println("The length of your string is: " + counter);
        } // end try-catch

        keyboard.close();

    } // end main

}
