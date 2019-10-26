/**
* Multidimensional Arrays - Exercise 2
* Ksenia Lake
* October 26, 2019
*/

public class Ex2 {
    public static void main(String[] args) {

        int[][] multTable = new int[12][12];
        // fill the array
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                multTable[i][j] = (i+1)*(j+1); // adjust so the multiplication table values start on 1.
            }
        }
        // print the array
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(multTable[i][j] + "\t");  // tab after each element
            }
            System.out.print("\n");  // end of row
        }
    }
}
