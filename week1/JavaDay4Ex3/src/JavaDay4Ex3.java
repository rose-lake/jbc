/** Nested loop example
 * Ksenia Lake
 * October 24, 2019
 */

public class JavaDay4Ex3 {

    public static void main(String[] args) {

        String asciiArt;

        for (int i = 1; i <= 9; i++) {
            asciiArt = "";
            for (int j = i; j >= 1; j--) {
                asciiArt += i;
            }
            System.out.println(asciiArt);
        }


    }


}
