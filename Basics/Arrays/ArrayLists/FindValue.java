/** ArrayList Find a Value
* Ksenia Lake
* October 27, 2019
*
* more array list practice exercises
* see code comments for components
*/

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;   // just in case ;)
import java.util.Random;

public class FindValue {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        ArrayList<Integer> randomList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        int value, index;
        int SIZE = 25;  // can choose to initialize array list with SIZE random values

        // part 1 :
        // Create an ArrayList that can hold Integers,
        // and fill each slot with a different random value from 1-50.
        for (int i = 0; i < SIZE; i++) {
            randomList.add(randomGenerator.nextInt(50) + 1); // range SIZE is 50, range is 1-50.
        }

        // part 2 : Display those values on the screen,
        // then prompt the user for an integer.
        System.out.println(randomList);
        System.out.println("Value to find: ");
        value = keyboard.nextInt();
        keyboard.nextLine(); // clear keyboard

        // part 3 : Search through the ArrayList, and if the item is present, say so.
        // It is not necessary to display anything if the value was not found.
        // If the item is in the ArrayList multiple times,
        // it's okay if the program prints the message more than once.
        for (int i = 0; i < SIZE; i++) {
            if (randomList.get(i) == value) {
                System.out.println(value + " was found at index " + i);
            }
        }

    }
}
