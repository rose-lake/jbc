/**
* Multidimensional arrays
* Sample code from canvas
*
* Modified to practice formatting output nicely in two dimensions
* Ksenia Lake
* October 26, 2019
*/

public class ThreeD {

    public static void main(String[] args) {

        int[][][] threeD = new int[4][4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    threeD[i][j][k] = i*100 + j*10 + k*1;
                }
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k ++) {
                    System.out.printf("%03d\t",threeD[i][j][k]);
                    //System.out.print("[" + i + "][" + j + "][" + k + "]  " + threeD[i][j][k] + "\t");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }

    } // end main

}
