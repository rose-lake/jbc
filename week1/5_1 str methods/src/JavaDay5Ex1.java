/** .substring() .length() .charAt() exercises
 * Ksenia Lake
 * October 25, 2019
 *
 * Create a program that will allow users to enter a word, and a character number index.
 * Your program will print out the size of the word, as well as the substring (starting from 0) to the index the user specified.
 * If the user entered index is larger than the size of the word, the program will print "Index is larger than length".
 *
 * ## Sample Input:
 * ```
 * Enter a word: alphabet
 * Enter a number as an index: 3
 * ```
 *
 * ## Sample Output:
 * ```
 * The length of alphabet is: 8
 * The substring from 0 to 3 is: alp
 * ```
 */

import java.util.Scanner;

public class JavaDay5Ex1 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userString;
        int subStringInt, length, charAtInt;

        System.out.println("Enter a word:");
        userString = keyboard.nextLine();
        System.out.println("Enter a number for a substring upper bound:");
        subStringInt = keyboard.nextInt();
        keyboard.nextLine();                // clear the end-of-line
        System.out.println("Enter a number for a charAt evaluation:");
        charAtInt = keyboard.nextInt();
        keyboard.nextLine();

        length = userString.length();
        System.out.println("The length of " + userString + " is: " + length);
        if (subStringInt <= length) {
            // so userInt CAN actually be equal to length!
            // substring is EXCLUSIVE of given upper bound... sigh.
            System.out.println("The substring from 0 to " + subStringInt + " is: " + userString.substring(0, subStringInt));
        } else {
            System.out.println("The substring upper bound you entered was greater than the length of " + userString + ".");
        }
        if (charAtInt < length) {
            System.out.println("The character at " + charAtInt + " is: " + userString.charAt(charAtInt));
        } else {
            System.out.println("The charAt index you entered was greater than " + (length-1) + ", the maximum index value for " + userString + ".");
        }

        //        // Sample code from canvas example
//        String text = "Hello World!";
//        String another = "Today is going to be a beautiful day!";
//
//        System.out.println("Using .length(): " );
//        System.out.println("The amount of characters in this word is : " + text.length());
//        System.out.println("The amount of characters in this other word is : " + another.length());
//
//        System.out.println("Using .substring(): " );
//        System.out.println("The section of word from index 0-5 is : " + text.substring(0,5));
//        System.out.println("The section of word from index 5-10 is : " + another.substring(5,10));
//
//        System.out.println("Using .charAt(): " );
//        System.out.println("The character at index 1 is : " + text.charAt(1));
//        System.out.println("The character at index 10 is : " + another.charAt(10));
    }
    
}
