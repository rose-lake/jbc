/**
 * Area Methods Exercise from canvas
 * Ksenia Lake
 * Wednesday, October 30, 2019
 */

import java.util.Scanner;

public class Areas {

    public static void main(String[] args){

        System.out.println("Welcome to Areas!");
        System.out.print("What type of area would you like to calculate?" +
                "\n\t(1) circle" +
                "\n\t(2) triangle" +
                "\n\t(3) rectangle" +
                "\n\t(4) square" +
                "\nPlease enter your choice: ");

        Scanner keyboard = new Scanner(System.in);
        String answer = keyboard.nextLine();


    }

    private static double circleArea(double radius) {
        return (radius * radius) * 3.14;
    }

    private static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }

    private static double rectangleArea(double base, double height) {
        return base * height;
    }

    private static double squareArea(double side) {
        return side * side;
    }
}
