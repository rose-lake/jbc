/**
 * Area Methods Exercise from canvas
 * Ksenia Lake
 * Wednesday, October 30, 2019
 */

import java.util.Scanner;

public class Areas {

    public static void main(String[] args){

        // choosing not to wrap in a while(true) "play" loop this time
        System.out.println("Welcome to Areas!");
        System.out.print("What type of area would you like to calculate?" +
                "\n\t1: circle" +
                "\n\t2: triangle" +
                "\n\t3: rectangle" +
                "\n\t4: square" +
                "\nPlease enter your choice: ");

        Scanner keyboard = new Scanner(System.in);
        int choice = keyboard.nextInt();                // choosing not to wrap in error-handler this time
        keyboard.nextLine();

        switch (choice) {
            case 1:
                circleArea();
                break;
            case 2:
                triangleArea();
                break;
            case 3:
                rectangleArea();
                break;
            case 4:
                squareArea();
                break;
            default:
                System.out.println("You did not enter a valid choice...");
        }

        System.out.println("Goodbye!");
        keyboard.close();

    }

    private static void circleArea() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a value for the radius (type is double): ");
        double radius = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("The area of your circle is: " + ((radius * radius) * 3.14));
    }

    private static void triangleArea() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter values for the base and the height (type is double)...");
        System.out.print("\tbase: ");
        double base = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("\theight: ");
        double height = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("The area of your triangle is: " + ((base * height)/2));
    }

    private static void rectangleArea() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter values for the base and the height (type is double)...");
        System.out.print("\tbase: ");
        double base = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("\theight: ");
        double height = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("The area of your rectangle is: " + ((base * height)));
    }

    private static void squareArea() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a value for the side (type is double): ");
        double side = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("The area of your square is: " + ((side * side)));
    }
}
