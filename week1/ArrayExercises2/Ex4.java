/**
* Ksenia Lake
* October 26, 2019
*
* Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
* Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:
* Expected output:
* (6,7)
* (9,4)
*
* note: For the given input, expected output should be:
* (7,6)
* (6,7)
* (9,4)
*/

public class Ex4 {
    public static void main(String[] args) {

        // int[] a1 = {1,7,6,5,9};
        // int[] a2 = {2,7,6,3,4};

        // *************************************
        // testing code:
        // *************************************
        // int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8};
        // int[] a2 = {10, 9, 8, 7};
        // *************************************
        // further testing code:
        // *************************************
        // int[] a1 = {13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3};
        // int[] a2 = {5, 6, 7, 8, 9, 0, 1, 16, 15, 14};
        // *************************************
        // yay! it all works! :)
        // *************************************

        // to handle possibly unequal length arrays as initial values:
        int sizea1 = a1.length;
        int sizea2 = a2.length;

        for (int i = 0; i < sizea1; i++) {
            for (int j = 1; j < sizea2; j++) {
                if ( (a1[i]+a2[j]) == 13 ) {
                    System.out.println("(" + a1[i] + "," + a2[j] + ")");
                }
            }
        }

    }
}
