/**
 * Ksenia Lake
 * October 26, 2019
 * Prompt the user to input SIZE values and store them into an array.
 * If there are any duplicate values in that array, remove them and print out the remaining values.
 *
 * note: will assume that 'values' == 'integers'
 */

import java.util.Scanner;
import java.util.Arrays;

public class Ex3{
    public static void main(String[] args) {

        // *******************************************
        // testing code :
        // *******************************************
        // int SIZE = 10;
        // int[] dup = {1, 2, 3, 1, 3, 3, 7, 7, 9, 2};
        // int[] dup = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        // int[] dup = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        // try with a different size, too:
        // int SIZE = 6;
        // int[] dup = {1, 45, 67, 45, 32, 32};
        // yes! it works!
        // *******************************************
        // end testing code
        // *******************************************
        // ****************************************************
        // to use testing code, comment out starting from here:
        // ****************************************************


        // if you want, you can change the input array size
        int SIZE = 10;

        // obtain user input
        int[] dup = new int[size];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter " + size + " integers, separated only by whitespace: ");
        // scan for integers in the line the user just inputted
        Scanner intScanner = new Scanner(keyboard.nextLine());
        for (int i = 0; i < size; i++){
            if (intScanner.hasNextInt()) {
                dup[i] = intScanner.nextInt();
            } else {
                System.out.println("Please enter at least " + size + "integers!");
                break;
            }
        }
        if (intScanner.hasNextInt()) {
            System.out.println("You entered more than " + size + " integers. Only the first " + size + " will be used.");
        }
        intScanner.close();
        keyboard.close();
        // ********************************************
        // to use testing code, comment out up to here
        // ********************************************

        // search for duplicate values
        boolean[] isDup = new boolean[size];
        int dupCount = 0;
        for (int i = 0; i < size; i++) {
            if (!isDup[i]) { // optimization
                for (int j = i+1; j < size; j++) { // compare for duplicates
                    // note: j starts at i+1 so you don't compare value to itself
                    if (dup[i] == dup[j]) {
                        isDup[j] = true;    // set duplicate flag
                        dupCount++;         // this is for later
                    } // duplicate check
                } // inner loop
            } // optimization: only execute inner loop if value is not already a duplicate.
        }

        // make a new array to hold the non-duplicate values only
        // we kept track of how many duplicates there were (in dupCount)
        // so now we can easily set the size of our new, non-duplicates array:
        //          new size = original size - number of duplicates.
        //          note: new size >= 1 because of the way we built the dup test loop.
        int[] noDup = new int[size-dupCount];
        // create our own indexer for placing non-duplicate values into noDup array.
        int noDupIndex = 0;
        // run loop over original duplicate array.
        for (int i = 0; i < size; i++) {
            if (!isDup[i]) {                    // if the value is not a duplicate
                noDup[noDupIndex] = dup[i];     // save the value into our noDup array
                noDupIndex++;
            }
        }

        System.out.println("Your original array is: " + Arrays.toString(dup));
        System.out.println("Your array with no duplicates is: " + Arrays.toString(noDup));

    }
}
