/**
* Ksenia Lake
* October 26, 2019
*
* Prompt the user to input SIZE values and store them into an array.
* Output the total number of odd and even values in the array.
*/

import java.util.Scanner;

public class CountEvenOdd{
    public static void main(String[] args) {
        // if you want, you can change the input array size
        int SIZE = 10;

        // counters for odds and evens
        int oddCounter = 0;
        int evenCounter = 0;

        // obtain and validate user input
        int[] userArray = new int[SIZE];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter " + SIZE + " integers, separated only by whitespace: ");
        Scanner intScanner = new Scanner(keyboard.nextLine());
        for (int i = 0; i < SIZE; i++){
            if (intScanner.hasNextInt()) {
                userArray[i] = intScanner.nextInt();
            } else {
                System.out.println("Please enter at least " + SIZE + "integers!");
                break;
            }
        }
        if (intScanner.hasNextInt()) {
            System.out.println("You entered more than " + SIZE + " integers. Only the first " + SIZE + " will be used.");
        }
        intScanner.close();
        keyboard.close();

        // count odd and even integers in given array
        for (int i = 0; i < SIZE; i++) {
            if (userArray[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        System.out.println("The total number of EVEN values is: " + evenCounter);
        System.out.println("The total number of ODD values is: " + oddCounter);

    }
}
