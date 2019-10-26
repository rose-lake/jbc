/**
 * Comparing Strings exercise
 *
 * Ksenia Lake
 * October 25, 2019
 *
 * A Weather Responder Program:
 * Given incomplete and buggy code,
 * debug it and complete the functionality.
 */
import java.util.Scanner;

public class WeatherResponder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather?");
        String answer = sc.nextLine();

        /* ************************************
         * code refactored to switch statement
         * ************************************/
        switch (answer) {
            case "rain" :
                System.out.println("Take your umbrella!");
                break;
            case "windy" :
                System.out.println("Wear your jacket!");
                break;
            case "snow" :
                System.out.println("Wear a coat and take a shovel!");
                break;
            case "stormy" :
                System.out.println("You should stay inside.");
                break;
            default:
                System.out.println("Enjoy your day!");
        }

        /* **********************************
         * original code structure : if-else
         * **********************************/
//        if (answer.equals("rain")) {
//            System.out.println("Take your umbrella!");
//        } else if (answer.equals("windy")) {
//            System.out.println("Wear your jacket!");
//        } else if (answer.equals("snow")) {
//            System.out.println("Wear a coat and take a shovel!");
//        } else if (answer.equals("stormy")) {
//            System.out.println("You should stay inside.");
//        } else {
//            System.out.println("Enjoy your day!");
//        }

    }

//    /* *******************************************
//     *  The original code, for fixing/debugging
//     * *******************************************/
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("How is the weather?");
//        String answer = sc.nextLine();
//
//        if (answer == "rain") {
//            System.out.println("Take your umbrella!");
//        } else if (answer == "windy") {
//            System.out.println("Wear your jacket!");
//        } else if (answer == "snow") {
//            System.out.println("Wear a coat and take a shovel!");
//        } else {
//            System.out.println("Enjoy your day!");
//        }
//    }



}
