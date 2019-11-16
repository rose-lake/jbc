import java.util.Scanner;  // alt-enter on a red-lined java term will automatically import the proper library!

public class MyFirstJava {

    public static void main(String[] args){
        System.out.println("Welcome to my world!");
        System.out.println("Hello, my name is Ksenia Rose Lake.");

        // Scanner class is one way to communicate with the user.
        // Needs System.in passed in.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String userResponse = keyboard.nextLine();
        System.out.println("Your name is " + userResponse + ".");

        // Ask the user for two numbers and print out the summation of the two numbers
        System.out.println("You will enter two numbers to be summed! Yay!");
        System.out.println("Please enter the first number: ");
        int firstNum = keyboard.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNum = keyboard.nextInt();
        
        System.out.println("Your two numbers were " + firstNum + " and " + secondNum +".");

        // this sums them toString()-wise
        System.out.println("Their sum is: " + firstNum + secondNum);
        // or, this will work
        int sumNum = firstNum + secondNum;
        System.out.println("Their sum also is: " + sumNum);
        // or, use parentheses to indicate we wish to do the mathematical operation
        // it, somehow, breaks us out of the "we're interpreting Strings" universe!
        System.out.println("Their sum is: " + (firstNum + secondNum));

        // clean up resources!
        keyboard.close();

    }

}
