/** Fun With ArrayLists exercise
* Ksenia Lake
* October 27, 2019
*
* √ Write a Java program to create a new array list to hold colors.
* √ Add at least 3 colors (string) to the array list and print out all its values.
* √ Using the array list created above, print out the value at index 1.
* √ Using the array list above, prompt the user for one new color, and add that color to the array list.
* √ Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit. Each time the user enters a color, add that to the array list. Print out the list at the end.
*/

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String newColor;
        boolean playAgain;

        colors.add("red");
        colors.add("magenta");
        colors.add("turquoise");
        colors.add("blue");

        System.out.println("\n" + colors);

        System.out.print("\nusing enhanced for loop: ");
        for (String color : colors) {
            System.out.print(color + "\t");
        }
        System.out.print("\n");

        System.out.print("\nValue at index 1: ");
        System.out.println(colors.get(1));

        System.out.print("Please enter one new color: ");
        newColor = keyboard.nextLine();
        colors.add(newColor);
        System.out.println(colors);

        playAgain = true;
        while (playAgain) {
            System.out.print("Please enter another color, or 'q' to exit: ");
            newColor = keyboard.nextLine();
            if (newColor.equalsIgnoreCase("q")) {
                playAgain = false;
            } else {
                colors.add(newColor);
            }
        }
        System.out.println("\nThe colors list is now: " + colors);

    }
}
