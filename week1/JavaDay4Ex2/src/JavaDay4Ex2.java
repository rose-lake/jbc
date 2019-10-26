/**
 * Loops Two
 * Second set of Loop Exercises from canvas
 *
 * Ksenia Lake
 * October 24, 2019
 *
 */

import java.util.Scanner;

public class JavaDay4Ex2 {

    public static void main(String[] args) {

        // declarations, initializations
        Scanner keyboard = new Scanner(System.in);
        int userInt;
        int sum, myCount, len;
        String asciiArt, userString;

        // exercise 11 :
        // Write a program to sum all the integers between 100 and 200 that are divisible by 9.
        System.out.println("Exercise 11: ");
        System.out.println("This code will sum all the integers between 100 and 200 that are divisible by 9.");
        sum = 0;
        System.out.println("The sum of...");
        for (int i = 100; i <= 200; i++) {
            if ( i % 9 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("...is " + sum + ".");


        // exercise 10 :
        // Prompt user for input, determine if that number is a palindrome
        // (a number that reads the same forward and backwards) e.g. 121
        System.out.println("Exercise 10: ");
        System.out.println("Hello! Welcome to palindrome tester! Please enter a String.");
        userString = keyboard.nextLine();
        len = userString.length();
        int topIndex = len-1;
        boolean isPalindrome;

        // note, this returns TRUE for a length==1 number or string.
        isPalindrome = true;
        for (int i = 0; i <= topIndex/2; i++) {
            if ( userString.charAt(i) != userString.charAt(topIndex-i) ) {  // not palindrome!
                isPalindrome = false;
                break;  // we EXIT THE LOOP!
            } // otherwise, do nothing, e.g. continue!
        }

        if(isPalindrome) {
            System.out.println("That was a palindrome!");
        } else {
            System.out.println("Nope, not a palindrome, sorry.");
        }

        System.out.println("Thanks for playing!");


        // exercise 9 :
        // Write a program to display the following:
        // 1
        // 01
        // 101
        // 0101
        // 10101
        System.out.println("Exercise 9: ");
        myCount = 1;
        for (int i = 1; i <= 5; i++) {
            asciiArt = "";
            for (int j = i; j >= 1; j--) {
                asciiArt += (myCount);
                if (myCount==1) {myCount=0;} else {myCount=1;}
            }
            System.out.println(asciiArt);
        }


        // exercise 8 :
        // Write a program to display the following:
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        System.out.println("Exercise 8: ");
        myCount = 1;
        for (int i = 1; i <= 4; i++) {
            asciiArt = "";
            for (int j = i; j >= 1; j--) {
                asciiArt += (myCount + " ");
                myCount++;
            }
            System.out.println(asciiArt);
        }


        // exercise 7 :
        // write a loop to display:
        // 1
        // 22
        // 333
        // 4444
        // 55555
        System.out.println("Exercise 7:");
        for (int i = 1; i <= 5; i++) {
            asciiArt = "";
            for (int j = i; j >= 1; j--) {
                asciiArt += i;
            }
            System.out.println(asciiArt);
        }

        // exercise 6 :
        // write a loop to display:
        // 1
        // 12
        // 123
        // 1234
        // 12345
        System.out.println("Exercise 6:");
        asciiArt = "";
        for (int i = 0; i < 5; i++) {
            asciiArt += (i+1);
            System.out.println(asciiArt);
        }

        // exercise 5 : ? no description given.

        // exercise 4 :
        // same as exercise 3, but even
        System.out.println("Exercise 4:");
        System.out.println("Hello! Welcome to EVEN number sum! Please enter an upper bound.");
        userInt = keyboard.nextInt();
        keyboard.nextLine();
        // processing
        sum = 0;
        for (int i = 0; i <= userInt; i++) {
            if (i % 2 == 0) {   // i is even
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("The sum of all the EVEN numbers from 0 to " + userInt + " is " + sum + ".");
        System.out.println("Thanks for playing!");


        // exercise 3 :
        // Prompt user for input,
        // output all odd numbers up to that bound
        // and then the sum of those odd numbers
        System.out.println("Exercise 3: ");
        System.out.println("Hello! Welcome to ODD number sum! Please enter an upper bound.");
        userInt = keyboard.nextInt();
        keyboard.nextLine();
        // processing
        sum = 0;
        for (int i = 0; i <= userInt; i++) {
            if (i % 2 == 1) {   // i is odd
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("The sum of all the ODD numbers from 0 to " + userInt + " is " + sum + ".");
        System.out.println("Thanks for playing!");


        // exercise 2 :
        // prompt for user input
        // display multiplication table for that number up to 10
        System.out.println("Exercise 2: ");
        System.out.println("Hello! Welcome to simple multiplication tables. Please enter an integer.");
        userInt = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.println(userInt + " * " + i + " = " + (userInt*i));
        }
        System.out.println("Thanks for playing!");

        // exercise 1 :
        // prompt for user input
        // display cube of "all the numbers up to that bound" ... okay... 1 to bound inclusive.
        System.out.println("Exercise 1: ");
        System.out.println("Hello! Welcome to cubes. Please enter an upper bound.");
        userInt = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 1; i <= userInt; i++) {
            System.out.println((i*i*i));
        }
        System.out.println("Thanks for playing!");

        // end of program
        keyboard.close();


    }

}
