/*
  Zork Game Assignment
  Team: Soheila & Ksenia
  Monday, October 28, 2019
 */

import java.util.Scanner;
import java.util.Random;

public class ZorkAssignment {

    private static boolean secretOpen;
    private static int numberVisited;
    private static int rooms = 8;             // the total number of rooms we have in our code!
    private static boolean[] roomsVisited = new boolean[rooms];  // by default initializes to all false

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
                quit();
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

        keyboard.close();

    } // end main

    private static void quit(){

        // how many (out of the total number of rooms possible) did we see?
        int counter = 0;
        for (int i = 0; i < rooms; i++) {
            if (roomsVisited[i]) {
                counter++;
            }
        }
        System.out.println("You saw " + counter + " out of a possible " + rooms + " rooms!");

        // also: how many rooms did we walk through while exploring?
        System.out.println("While exploring the castle, you walked through " + numberVisited + " rooms!");

        // ghost! 25% chance it will follow on exit.
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(4) + 1;   // make it random in the range of 1 through 4
        if (random == 1) {
            System.out.println("\n*** You are being followed by a ghost! ***\n");
        }

        System.out.println("Goodbye!");
    }

    private static int roomOne() {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        int room;

        numberVisited++;
        roomsVisited[0] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 1, the foyer.");
        System.out.println("You see a dead scorpion.");
        System.out.println("You can go North (N), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                room = 2;
                break;
            } else if (answer.equalsIgnoreCase("q")) {
                room = 0;
                break;
            } else {
                System.out.println("Please enter a valid choice (N:North, Q:Quit): ");
            }
        }

        return room;

    } // end room one method


    private static int roomTwo() {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        int room;

        numberVisited++;
        roomsVisited[1] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 2, the front room.");
        System.out.println("You see a piano.");
        System.out.println("You can go South (S), West (W), East (E), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("s")) {
                room = 1;
                break;
            } else if(answer.equalsIgnoreCase("w")){
                room = 3;
                break;
            } else if(answer.equalsIgnoreCase("e")){
                room = 4;
                break;
            } else if (answer.equalsIgnoreCase("q")) {
                room = 0;
                break;
            } else {
                System.out.println("Please enter a valid choice (S:South, W:West, E:East, Q:Quit): ");
            }
        } //end while loop - room 2

        return room;

    } //end-room two method


    private static int roomThree() {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        int room;

        numberVisited++;
        roomsVisited[2] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 3, the library.");
        System.out.println("You see a bunch of spiders.");
        System.out.println("You can go North (N), East (E), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                room = 5;
                break;
            } else if (answer.equalsIgnoreCase("e")) {
                room = 2;
                break;
            } else if (answer.equalsIgnoreCase("q")) {
                room = 0;
                break;
            }else {
                System.out.println("Please enter a valid choice (N:North, E:East, Q:Quit): ");
            }
        }

        return room;

    } // end room three method

    private static int roomFour() {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        int room;

        numberVisited++;
        roomsVisited[3] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 4, the kitchen room.");
        System.out.println("You see bats.");
        System.out.println("You can go West (W), North (N), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("w")) {
                room = 2;
                break;
            } else if (answer.equalsIgnoreCase("n")) {
                room = 7;
                break;
            } else if (answer.equalsIgnoreCase("q")) {
                room = 0;
                break;
            } else {
                System.out.println("Please enter a valid choice (W:West, N:North, Q:Quit): ");
            }
        } //end while loop - room 4

        return room;

    } // end room four method

    private static int roomFive() {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        int room;

        numberVisited++;
        roomsVisited[4] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 5, the dining room.");
        System.out.println("You see some dust and an empty box.");
        System.out.println("You can only go South (S), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("s")) {
                room = 3;
                break;
            } else if (answer.equalsIgnoreCase("q")) {
                room = 0;
                break;
            } else {
                System.out.println("Please enter a valid choice (S:South, Q:Quit): ");
            }
        }

        return room;

    } // end room five method

    private static int roomSix() {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        int room;

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
                    room = 7;
                    break;
                } else if (answer.equalsIgnoreCase("*")) {
                    room = 8;
                    break;
                } else if (answer.equalsIgnoreCase("q")) {
                    room = 0;
                    break;
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
                    room = 7;
                    break;
                } else if (answer.equalsIgnoreCase("q")) {
                    room = 0;
                    break;
                } else {
                    System.out.println("Please enter a valid choice (E:East, Q:Quit): ");
                }
            } //end while loop :: secret NOT open
        } // end if-else whether secret room is available or not

        return room;

    } // end room six method


    private static int roomSeven() {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        int room;

        numberVisited++;
        roomsVisited[6] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 7, the parlor room.");
        System.out.println("You see a treasure chest.");
        System.out.println("You can go West (W), South (S), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("W")) {
                room = 6;  // will call method roomSix from inside main()
                break;
            } else if (answer.equalsIgnoreCase("S")) {
                room = 4; // will call method roomFour from inside main()
                break;
            } else if (answer.equalsIgnoreCase("q")) {
                room = 0;
                break;
            } else {
                System.out.println("Please enter a valid choice (W:West, S:South, Q:Quit): ");
            }
        } //end while loop - room 7

        return room;

    } //end- roomSeven method


    private static int roomEight() {
        Scanner keyboard = new Scanner(System.in);
        String answer;
        int room;

        numberVisited++;
        roomsVisited[7] = true;     // room # - 1 = index #
        System.out.println("Welcome to room 8, the secret room.");
        System.out.println("You see piles of gold!.");
        System.out.println("You can only go West (W), or Quit (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("W")) {
                room = 6;  // will call method roomSix from inside main()
                break;
            } else if (answer.equalsIgnoreCase("q")) {
                room = 0;
                break;
            } else {
                System.out.println("Please enter a valid choice (W:West, Q:Quit): ");
            }
        }

        return room;

    } // end room eight method

}
