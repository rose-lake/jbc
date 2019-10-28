/**
 * Zork Game Assignment
 * Team: Soheila & Ksenia
 * Monday, October 28, 2019
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ZorkAssignment {

    public static boolean secretOpen;
    public static int numberVisited;
    public static int rooms = 8;             // the total number of rooms we have in our code!
    public static boolean[] roomsVisited = new boolean[rooms];  // by default initializes to all false

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        int choice;
        boolean play;

        System.out.println("Welcome to Zork!");
        System.out.println("Would you like to play (Y/N)?");
        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                choice = 1;
                break;
            } else if (answer.equalsIgnoreCase("n")) {
                choice = 0;
                break;
            } else {
                System.out.println("Please enter a valid choice (Y: to play, N: to quit): ");
            }
        }

        play = true;
        secretOpen = false;
        numberVisited = 0;
        while (play) {
            if (choice == 0) {
                play = false;
                ghost();
            } else if (choice == 1) {
                choice = roomOne();
            } else if (choice == 2) {
                choice = roomTwo();
            } else if (choice == 3) {
                choice = roomThree();
            } else if (choice == 4) {
                choice = roomFour();
            } else if (choice == 5) {
                choice = roomFive();
            } else if (choice == 6) {
                choice = roomSix();
            } else if (choice == 7) {
                choice = roomSeven();
            } else if (choice == 8) {
                choice = roomEight();
            } // end else-ifs

        } // end play loop

    } // end main

    public static void ghost(){
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(4) + 1;   // make it random in the range of 1 through 4

        // how many of the total rooms did we see?
        int counter = 0;
        for (int i = 0; i < rooms; i++) {
            if (roomsVisited[i] == true) {
                counter++;
            }
        }
        System.out.println("You saw " + counter + " out of a possible " + rooms + " rooms!");

        System.out.println("While exploring the castle, you walked through " + numberVisited + " rooms!");

        if (random == 1) {
            System.out.println("\n*** You are being followed by a ghost! ***\n");
        }

        System.out.println("Goodbye!");
    }

    public static int roomOne() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        numberVisited++;
        roomsVisited[0] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 1, the foyer.");
        System.out.println("You see a dead scorpion.");
        System.out.println("You can go North (N), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                return 2;  // will call method roomTwo from inside main()
            } else if (answer.equalsIgnoreCase("q")) {
                return 0;
            } else {
                System.out.println("Please enter a valid choice (N:North, Q:Quit): ");
            }
        }

    } // end room one method


    public static int roomTwo() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        numberVisited++;
        roomsVisited[1] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 2, the front room.");
        System.out.println("You see a piano.");
        System.out.println("You can go South (S), West (W), East (E), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("s")) {
                return 1;  // will call method roomOne from inside main()
            } else if(answer.equalsIgnoreCase("w")){
                return 3; // will call method roomThree from inside main()
            } else if(answer.equalsIgnoreCase("e")){
                return 4; // will call method roomFour from inside main()
            } else if (answer.equalsIgnoreCase("q")) {
                return 0;
            } else {
                System.out.println("Please enter a valid choice (S:South, W:West, E:East, Q:Quit): ");
            }
        } //end while loop - room 2

    } //end-room two method


    public static int roomThree() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        numberVisited++;
        roomsVisited[2] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 3, the library.");
        System.out.println("You see a bunch of spiders.");
        System.out.println("You can go North (N), East (E), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                return 5;  // will call method roomTwo from inside main()
            } else if (answer.equalsIgnoreCase("e")) {
                return 2;
            } else if (answer.equalsIgnoreCase("q")) {
                return 0;
            }else {
                System.out.println("Please enter a valid choice (N:North, E:East, Q:Quit): ");
            }
        }

    } // end room three method

    public static int roomFour() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        numberVisited++;
        roomsVisited[3] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 4, the kitchen room.");
        System.out.println("You see bats.");
        System.out.println("You can go West (W), North (N), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("w")) {
                return 2;  // will call method roomTwo from inside main()
            } else if (answer.equalsIgnoreCase("n")) {
                return 7; // will call method roomSeven from inside main()
            } else if (answer.equalsIgnoreCase("q")) {
                return 0;
            } else {
                System.out.println("Please enter a valid choice (W:West, N:North, Q:Quit): ");
            }
        } //end while loop - room 4

    } // end room four method

    public static int roomFive() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        numberVisited++;
        roomsVisited[4] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 5, the dining room.");
        System.out.println("You see some dust and an empty box.");
        System.out.println("You can only go South (S), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("s")) {
                return 3;  // will call method roomTwo from inside main()
            } else if (answer.equalsIgnoreCase("q")) {
                return 0;
            } else {
                System.out.println("Please enter a valid choice (S:South, Q:Quit): ");
            }
        }

    } // end room five method

    public static int roomSix() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        numberVisited++;
        roomsVisited[5] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 6, the vault.");
        System.out.println("You see 3 walking skeletons.");

        if(!secretOpen) {  // if secret room is not already open
            // 25% chance that secret will open
            Random randomGenerator = new Random();
            int random = randomGenerator.nextInt(4) + 1;   // make it random in the range of 1 through 4
            if (random == 1) {
                // the secret is opened!
                secretOpen = true;
            }
        }

        if (secretOpen) {
            System.out.println("You can go East to the parlor (E), East to the Secret Room (*), or Quit (Q).");
            while (true) {
                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase("e")) {
                    return 7;
                } else if (answer.equalsIgnoreCase("*")) {
                    return 8; // will call method roomEight from inside main()
                } else if (answer.equalsIgnoreCase("q")) {
                    return 0;
                } else {
                    System.out.println("Please enter a valid choice (E:East, *:Secret Room, Q:Quit): ");
                }
            } //end while loop :: secret open !! :)
        }
        else {
            System.out.println("You can go East (E), or Quit (Q).");
            while (true) {
                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase("e")) {
                    return 7;
                } else if (answer.equalsIgnoreCase("q")) {
                    return 0;
                } else {
                    System.out.println("Please enter a valid choice (E:East, Q:Quit): ");
                }
            } //end while loop :: secret NOT open
        } // end if-else whether secret room is available or not

    } // end room six method


    public static int roomSeven() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        numberVisited++;
        roomsVisited[6] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 7, the parlor room.");
        System.out.println("You see a treasure chest.");
        System.out.println("You can go West (W), South (S), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("W")) {
                return 6;  // will call method roomSix from inside main()
            } else if (answer.equalsIgnoreCase("S")) {
                return 4; // will call method roomFour from inside main()
            } else if (answer.equalsIgnoreCase("q")) {
                return 0;
            } else {
                System.out.println("Please enter a valid choice (W:West, S:South, Q:Quit): ");
            }
        } //end while loop - room 7

    } //end- roomSeven method


    public static int roomEight() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        numberVisited++;
        roomsVisited[7] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 8, the secret room.");
        System.out.println("You see piles of gold!.");
        System.out.println("You can only go West (W), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("W")) {
                return 6;  // will call method roomSix from inside main()
            } else if (answer.equalsIgnoreCase("q")) {
                return 0;
            } else {
                System.out.println("Please enter a valid choice (W:West, Q:Quit): ");
            }
        }

    } // end room eight method

}
