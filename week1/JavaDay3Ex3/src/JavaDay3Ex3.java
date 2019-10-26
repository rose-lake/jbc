/*
* Debugging a loop activity
* Ksenia Lake
* October 23, 2019
*
* ASSIGNMENT:
* The following program should allow the user to input as many things as they want until they stop.
* Each time it is supposed to repeat with what the user said, can you fix it?
*/

import java.util.Scanner;

public class JavaDay3Ex3 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userInput = "";

        // added a prompt
        System.out.println("Hello! \nPlease enter any text! \nIf you want to exit, hit enter.");
        userInput = keyboard.nextLine();    // changed to nextLine()

        while (!userInput.isBlank()) {    // added `not isBlank()` test.
            System.out.println(userInput);
            userInput = keyboard.nextLine();    // added this line of code
        }

        // added clean exit:
        System.out.println("Thanks for playing!");
        keyboard.close();

    }
}
