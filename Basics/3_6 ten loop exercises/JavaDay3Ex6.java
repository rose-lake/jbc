/**
 * 'Loops' Assignment
 * Ksenia Lake
 * October 23, 2019
 *
 * This class contains all the answers to the 'Loops' assignment, detailed in these comments.
 *
 * Loops:
 * 1. Write a program that prints the numbers 1-10
 * 2. Write a program that prints the numbers 1-10 backwards.
 * 3. Write a program that prints all the odd numbers from 1-20.
 * 4. Write a program that prints all the even numbers from 1-20.
 * 5. Have the user input a number and print all numbers from that input value to 1.
 * 6. Sum all values from 1-10.
 * 7. Have the user enter a number and print the sum of all numbers from that inputted value to 1.
 * 8. Write loops to print the following: (see README.md in repository for the patterns)
 *
 * 9. Guessing Game: this is implemented in a separate class/package/repository
 *
 * 10. Factorial of a Number:
 * You are going to write an application to determine the factorial of a single number.
 * A factorial of an integer is the product of that integer and all the integers below it.
 * For example, the factorial of 4 is (4 x 3 x 2 x 1 = 24).
 * The user will be required to enter an integer.
 * You will then calculate the factorial of that integer and print the result to the screen.
 *
 */

import java.util.Scanner;

public class JavaDay3Ex6 {

    public static void main(String[] args) {

        // variable declarations for 1 - 8 code
        Scanner keyboard = new Scanner(System.in);
        int userInt;
        int sum;
        String asciiArt;

        // variable declaration for #10
        long factorial = 1;

//        // loops #1 :: print numbers 1-10
//        for (int i = 0; i < 10; i++) {
//            System.out.println((i+1));
//        }
//
//        // loops #2 :: print numbers 10-1
//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//        }
//
//        // loops 3 :: print all odds from 1 to 20
//        for (int i = 1; i <= 20; i ++) {
//            if ( i % 2 != 0) {    // it is not even (e.g. it is odd)
//                System.out.println(i);
//            }
//        }
//
//        // loops 4 :: print all evens from 1 to 20
//        for (int i = 1; i <=20; i++) {
//            if (i % 2 == 0) {    // it is even
//                System.out.println(i);
//            }
//        }
//
//        // loops 5 :: ask user to input a number, print all numbers from input to 1.
//        System.out.println("Please enter a positive number: ");    // will not write code for negative #s today
//        userInt = keyboard.nextInt();
//        keyboard.nextLine();
//        for (int i = userInt; i >= 1; i--) {
//            System.out.println(i);
//        }
//
//        // loops 6 :: Sum all values from 1-10
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        // loops 7 :: user enters a number, print sum of all numbers from user's number to 1.
//        System.out.println("Please enter a positive number: ");    // will not write code for negative #s today
//        userInt = keyboard.nextInt();
//        keyboard.nextLine();
//        sum = 0;
//        for (int i = 1; i <= userInt; i++ ) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        // loops 8 :: Write loops to print various ASCII art patterns. See Comments section.
//        // loops 8 - A :: pattern 1
//        for (int i = 0; i < 4; i++) {
//            System.out.println("**********");
//        }
//
//        // loops 8 - B :: pattern 2
//        asciiArt = "";     // initialize the art string
//        for (int i = 0; i < 5; i++) {
//            asciiArt += "*";
//            System.out.println(asciiArt);
//        }
//
//        // loops 8 - C :: pattern 3
//        int start=1, end=5;     // declare and initialize in place. less confusing!!
//        for (int i = start; i <= end; i++) {
//            // white space
//            for (int j = i; j <= end-1; j++) {
//                System.out.print(" ");
//            }
//            // stars after
//            for (int k = start; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        } // outer loop -- loops 8 - C :: pattern 3
//
//         // loops 9 -- see separate project! (JavaDay3Ex7)
//         // submitted separately in Canvas -- there was a separate submission link just for Guessing Game.

        // loops #10 :: Factorial (!) of a given user-entered Integer.
        // int type :: only works up to 12!
        // long type :: only works up to 20!
        // didn't test float or double types yet... ! ;)
        System.out.println("This code will calculate the factorial of an integer.");
        System.out.println("Because factorials very quickly get very large, even a 'long' type can only handle factorials up to 20!");
        System.out.println("Please enter an integer less than or equal to 20...");
        userInt = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 1; i <= userInt; i++) {
            factorial = factorial * i;
        }
        System.out.println(userInt + " factorial is equal to " + factorial);



    }

}
