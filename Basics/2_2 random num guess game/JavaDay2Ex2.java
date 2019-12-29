/*
 * Commenting
 *      Random Number Guessing Game Program
 * as an exercise
 * Ksenia Lake
 * October 22, 2019
 */
import java.util.Random;
import java.util.Scanner;
public class JavaDay2Ex2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // This sets the range of your random number.
        // nextInt returns a random in range from zero (inclusive) to parameter (exclusive)
        // hence the need to always ADD ONE if you really want to include the top of the range
        // finally, you add on min afterwards, to set the range to START FROM your min.
        Random random = new Random();
        long from = 1;
        long to = 100;
        int randomNumber = random.nextInt((int)(to - from + 1)) + (int)from;

        // notice the data types of the variables declared so far
        // (int) is an explicit cast that will convert a 'long' data type to an 'int' data type

        // we initialize our guessing number
        int guessedNumber = 0;

        // we print out the range we have used for our random number
        System.out.printf("The number is between %d and %d.\n", from, to);

        // we play a guessing game with the user
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);

        // clean up resources!
        scan.close();
    }
}
