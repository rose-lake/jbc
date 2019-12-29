/**
 * FizzBuzz
 * Ksenia Lake
 * October 24, 2019
 *
 * Today's implementation of Fizz Buzz.
 */

public class JavaDay4Ex1 {

    public static void main(String[] args) {
        String output = "";
        for (int i=1; i<=100; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
                System.out.print("\n");
            } else {
              System.out.println(i);
            }

        }
    }
}
