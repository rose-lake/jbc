/** Random Number Generator
 * Debugging exercise
 *
 * Ksenia Lake
 * October 25, 2019
 */

import java.util.Random;

public class JavaDay5Ex3 {

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }

    public static void main(String[] args) {

        Random rnd = new Random();
        int randomInt;

        /* *********************************************************
         * This code generates 10 random integers between 0 and 6
         *   Yes, it actually does!!
         * *********************************************************/
//        output("This program will generate 10 random integers between 0 and 6");
//
//        for (int i = 0; i < 10; i++) {
//            randomInt = rnd.nextInt(7);  // returns a range from 0 to 6. this range has SIZE 7.
//                                         // if you think of it as a RANGE SIZE, then it is INCLUSIVE of SIZE
//                                         // if you think of it as a BOUND from ZERO to BOUND, then it is EXCLUSIVE of BOUND.
//            output("Generated number: " + randomInt);
//        }

        /* *********************************************************
         * Now, THIS code generates 10 random integers between ***ONE*** and 6 !
         * Ah!... Never believe the sysout ;) lol... read the requirements...
         * *********************************************************/
        output("This program will generate 10 random integers between 1 and 6");
        for (int i = 0; i < 10; i++) {
            randomInt = 1 + rnd.nextInt(6);  // returns a range from 1 to 6. this range has SIZE 6, and START 1.
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

}
