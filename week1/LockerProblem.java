/**
* Ksenia Lake
* October 26, 2019
*
* 1. start with first locker, open every locker
* 2. flip second locker + flip every second locker after
* 3. flip the third locker + flip every third locker after
* ... etc
* until done.
*
* do with a 100-locker array.
*
* What do you notice about the lockers that are open at the end?
*
* Solved on paper, first: it's the perfect squares!
* Because they have an odd number of factors (the single one which squares)
* rather than pairs of factors throughout like every other non-square number.
* Even the prime numbers have two factors: one and the prime itself.
*/

import java.util.Arrays;

public class LockerProblem {

    public static void main(String[] args) {

        boolean[] lockers = new boolean[100];

        // 'n' :: the nth number we doing the flips for. ORDINAL.
        for (int n = 1; n <= 100; n++) {

            // start INDEX i at (n-1) because i is the INDEX, while n is our ORDINAL position
            for (int i = (n-1); i < 100; i = i + n ) {
                if (lockers[i]) { // if it is true
                    lockers[i] = false;
                } else {  // else it is false
                    lockers[i] = true;
                }
            } // end boolean-flipping pass through the array

        } // end nth iteration

        // print out, nicely ::
        for (int i = 0; i < 100; i++) {
            System.out.printf("%4d:%-8s\t", (i+1), lockers[i]);
            if ( (i+1) % 10 == 0) {
                System.out.print("\n");  // wrap every tenth element.
            }
        }

    } // end main

} // end class
