/** An Array To Remember
* Ksenia Lake
* October 27, 2019
*
* Thsi project uses array lists to:
* 1. accept ten string values
* 2. when the word "history" is entered by the user,
* the program prints the string values back out in the reverse order they were entered
*/

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class AnArrayToRemember {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        boolean playAgain = true;
        String name;

        // *************************************
        //    unlimited number of entries:
        // *************************************
        // System.out.println("Welcome to 'History'!");
        // do {
        //     System.out.print("Please enter a name, or type 'history' to exit: ");
        //     name = keyboard.nextLine();
        //     if (name.equalsIgnoreCase("history")) {playAgain=false;}
        //     else {
        //         names.add(name);
        //     }
        // } while (playAgain);
        //
        // Collections.reverse(names);
        // System.out.println("\nHere's your history: ");
        // for (String name : names ) {
        //     System.out.println(name);
        // }
        // System.out.println("\nThanks for playing!");
        // keyboard.close();
        // *************************************

        // *************************************
        //     exactly ten entries:
        // *************************************
        System.out.println("Welcome to 'History'!");
        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter a name: ");
            name = keyboard.nextLine();
            names.add(name);
        }
        System.out.print("To see your history, please type 'history': ");
        name = keyboard.nextLine();
        if (name.equalsIgnoreCase("history")) {
            Collections.reverse(names);
            for (int i = 0; i < 9; i++) {
                System.out.print(names.get(i) + ", ");
            }
            System.out.println(names.get(9) + ".");
            System.out.println("\nThanks for playing!");
        } else {
            System.out.println("\nSorry, I don't understand. Goodbye!");
        }
        keyboard.close();
        // *************************************
    }
}
