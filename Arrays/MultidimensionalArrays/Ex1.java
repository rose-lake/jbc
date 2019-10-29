/**
* Ksenia Lake
* October 26, 2019
*
* exercise: Create a multidimensional array that prints ten rows numbered 1-10 and five columns numbered 1-5.
*/

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        // array of gender, major, state, score
        String[][] twoDim = new String[10][5];

        // initialize the array using a loop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                twoDim[i][j] = "row " + i + " col " + j;
            }
        }

        // print the array using a loop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoDim[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
