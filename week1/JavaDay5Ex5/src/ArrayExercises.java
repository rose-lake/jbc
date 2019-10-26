/**
 * Practice with Arrays -- 1
 * Ksenia Lake
 * October 25, 2019
 *
 * see README.md for requirements.
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {

    public static void main(String[] args) {

        int sum = 0;
        int[] arrayTen, arrayUser;
        Scanner keyboard = new Scanner(System.in);
        double average;

//        // example 0 :: shortcut version of example 1
//        int[] arrayShortcut = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(Arrays.toString(arrayShortcut));
//
//        // example 1 :: create an array of the numbers 1 - 10
//        arrayTen = new int[10];
//        for (int i = 0; i < 10; i++) {
//            arrayTen[i] = (i+1);
//        }
//        System.out.println(Arrays.toString(arrayTen));
//
//        // example 2 :: sum all elements of array from example 1
//        for (int i = 0; i < 10; i++) {
//            sum += arrayTen[i];
//        }
//        System.out.println(sum);

//        // example 3 :: repeat example 2 with user input
//        System.out.println("Please enter 10 integers: ");
//        arrayUser = new int[10];
//        sum = 0;
//        for (int i=0; i<10; i++) {
//            arrayUser[i] = keyboard.nextInt();
//            sum += arrayUser[i];
//        }
//        keyboard.nextLine();
//        System.out.println(Arrays.toString(arrayUser));
//        System.out.println(sum);

//        // example 4 :: ditto example 3 except this time find the average of all ten elements
//        System.out.println("Please enter 10 integers: ");
//        arrayUser = new int[10];
//        sum = 0;
//        for (int i=0; i<10; i++) {
//            arrayUser[i] = keyboard.nextInt();
//            sum += arrayUser[i];
//        }
//        keyboard.nextLine();
//        average = sum / 10.0;    // even though sum is int, dividing by 10.0 casts to double
//        System.out.println("The average of your 10 integers is: " + average);

//        // example 5 :: store three names in an array, and loop through the array to print them out
//        String[] aStr = {"Bob", "joe", "jim"};
//        for (int i = 0; i < 3; i++) {
//            System.out.println(aStr[i]);
//        }
//        System.out.println(Arrays.toString(aStr));

//        // example 6 :: create an array [2,5,9,0,2,1,8,5,4]
//        // loop through the array and print the INDEX each time the VALUE equals 5
//        int[] aInt = {2,5,9,0,2,1,8,5,4};
//        for (int i = 0; i < aInt.length; i++) {
//            if (aInt[i] == 5) {
//                System.out.println("Value is equal to 5 at index: " + i );
//            }
//        }

//        // example 7 :: declare array values 1-10, print out backwards
//        int[] aInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = (aInt.length-1); i >= 0; i--) {
//            System.out.println("The value of Array["+i+"] is: " + aInt[i]);
//        }

//        // example 8 :: given array ['w','t','y','h','k']
//        // Loop through the array and replace the the letter 't' with the word "hello" once it's found.
//        // NOTE: this assignment is not possible as stated, each element must be a String
//        String[] aStr = {"w", "t", "y", "h", "k"};
//        System.out.println(Arrays.toString(aStr));
//        for (int i = 0; i < aStr.length; i++) {
//            if (aStr[i] == "t") {
//                aStr[i] = "hello";
//            }
//        }
//        System.out.println(Arrays.toString(aStr));

        // example 9 :: Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        // print out all matching pairs from arrays 1 and 2.
        //Expected output:
        //(7,7) and (6,6)
        int[] arr1 = {1, 7, 6, 5, 9};
        int[] arr2 = {2, 7, 6, 3, 4};
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    System.out.println("("+arr1[i]+","+arr2[i]+")");
                } // else do nothing
            }
        } // else do nothing

    }

}
