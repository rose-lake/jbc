/*
 * Input/Output Change Assignment
 * Ksenia Lake
 * October 22, 2019
 *
 * DESCRIPTION:
 * This application takes 2 integer values and finds the largest one.
 *
 * ASSIGNMENT:
 * Change the application so that it finds the average of two double values.
 */

import java.util.Scanner;

public class JavaDay2Ex4 {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextDouble();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextDouble();

        // find the average:
        num3 = (num1 + num2) / 2;

        // print out the average:
        System.out.println("The average of those two temperatures is: " + num3);

//        // old code: this found the maximum of the two values given.
//        System.out.println("The max value is : " + Math.max(num1, num2));

        // close the resource!
        keyboard.close();
    }
}


