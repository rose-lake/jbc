/*
 * String Completion Assignment
 * Ksenia Lake
 * October 22, 2019
 *
 * DESCRIPTION:
 * The following code is supposed to ask the user their pet's name, breed and age.
 * Add the 3 lines necessary to make this work...
 */
import java.util.Scanner;
public class JavaDay2Ex5 {
    public static void main(String[] args){

        // declare variables
        String name;
        String breed;
        int age;

        // declare and initialize scanner
        Scanner keyboard = new Scanner(System.in);

        // request and store user input
        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.next();

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.next();

        System.out.print( "How old is " + name + "? ");
        age = keyboard.nextInt();

        // output
        System.out.println( name + " is your " + breed + " and it is " + age );

        // close resource
        keyboard.close();

        /**********************************************************
         * the code below this box works,
         * but it does not KEEP the EXACT code that was originally given
         * and ONLY add three lines...
         **********************************************************/
//        // declare and initialize Scanner object
//        Scanner keyboard = new Scanner(System.in);
//
//        // request information from user, and save it to appropriate variables
//        System.out.println("Greetings. What is your pet's name? ");
//        name = keyboard.nextLine(); // this gets skipped
//
//        System.out.println("What kind of animal is " + name + "? ");
//        breed = keyboard.nextLine();
//
//        System.out.println("How old is " + name + "? ");
//        age = keyboard.nextInt();
//
//        System.out.println(name + " is your " + breed + " and it is " + age );
//        keyboard.close();
    }
}
