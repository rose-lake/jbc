/**
* Multidimensional arrays
* Sample code from canvas
*
* Modified to practice formatting output nicely in two dimensions
* Ksenia Lake
* October 26, 2019
*/

public class Ex0 {

    public static void main(String[] args) {

        // array of gender, major, state, score
        String[][] studentGradebook = new String[100][4];

        studentGradebook[0][0] = "M";
        studentGradebook[0][1] = "Econ";
        studentGradebook[0][2] = "MD";
        studentGradebook[0][3] = "99";

        studentGradebook[1][0] = "F";
        studentGradebook[1][1] = "Mktg";
        studentGradebook[1][2] = "VA";
        studentGradebook[1][3] = "89";

        studentGradebook[2][0] = "F";
        studentGradebook[2][1] = "Biol";
        studentGradebook[2][2] = "NJ";
        studentGradebook[2][3] = "100";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + i + "][" + j + "]  " + studentGradebook[i][j] + "\t");
            }
            System.out.print("\n");
        }

    } // end main

}
