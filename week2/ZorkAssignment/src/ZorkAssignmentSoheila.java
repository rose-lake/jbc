import java.util.Random;
import java.util.Scanner;

public class ZorkAssignmentSoheila {

    public static boolean secretOpen;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int answer;
        boolean play = true;

        System.out.println("Welcome to Zork!");

        System.out.println("Go to room 1 (1) or exit (0)?");
        answer = keyboard.nextInt();
        keyboard.nextLine();

        secretOpen = false;

        while (play) {
            if (answer == 0) {
                play = false;
                ghost();
                //System.out.println("Goodbye!");
            } else if (answer == 1) {
                answer = roomOne();
                System.out.println(answer);
            } else if (answer == 2) {
                answer = roomTwo();
                System.out.println(answer);
            } else if (answer == 3) {
                answer = roomThree();
            } else if (answer == 4) {
                answer = roomFour();
                System.out.println(answer);
            } else if (answer == 5) {
                answer = roomFive();
            } else if (answer == 6) {
               answer = roomSix();
            } else if (answer == 7) {
                answer = roomSeven();
            } else if (answer == 8) {
                answer = roomEight();
            } //end if statements
        } //end while loop

    } //end main method

    public static void ghost(){
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(4) + 1;   // make it random in the range of 1 through 4
        if (random == 1) {
            System.out.println("You are being followed by a ghost!");
        }
        System.out.println("Goodbye!");
    }


    public static int roomOne() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        System.out.println("Welcome to room 1, the foyer.");
        System.out.println("You see a dead scorpion.");
        System.out.println("You can go North (N) or leave (Q).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                return 2;  // will call method roomTwo from inside main()
            } else if (answer.equalsIgnoreCase("q")) {
                return 0;
            } else {
                System.out.println("Please enter a valid choice (N: North to room 2, Q: to exit castle): ");
            }
        } //end while loop - room 1

    } //end-room one method

    public static int roomTwo() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        System.out.println("Welcome to room 2, the front room.");
        System.out.println("You see a piano.");
        System.out.println("You can go South (S), or West (W), or East (E)");

        while (true) {
            //System.out.println("top of while loop, room 2");
            answer = keyboard.nextLine();
            //System.out.println("just before if-else, answer is " + answer);
            if (answer.equalsIgnoreCase("S")) {
                //System.out.println("in if \"s\" answer was " + answer);
                return 1;  // will call method roomOne from inside main()
            } else if (answer.equalsIgnoreCase("w")) {
                //System.out.println("in else-if \"w\", answer was " + answer);
                return 3; // will call method roomThree from inside main()
            } else if (answer.equalsIgnoreCase("e")) {
                //System.out.println("in else-if \"e\", answer was " + answer);
                //System.out.println(answer);
                return 4; // will call method roomFour from inside main()
            } else {
                //System.out.println("in else: answer was " + answer);
                System.out.println("Please enter a valid choice (S: South back to room 1, W: to room 3, E: to room 4): ");
            }
        } //end while loop - room 2

    } //end-room two method

    public static int roomThree() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        System.out.println("Welcome to room 3, the library.");
        System.out.println("You see a bunch of spiders.");
        System.out.println("You can go North (N) or go back the way you came (E).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                return 5;  // will call method roomTwo from inside main()
            } else if (answer.equalsIgnoreCase("e")) {
                return 2;
            } else {
                System.out.println("Please enter a valid choice (N: North, E: East): ");
            }
        }//end-while loop
    } //end - room three method

    public static int roomFour() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        System.out.println("Welcome to room 4, the kitchen room.");
        System.out.println("You see a bunch of bats.");
        System.out.println("You can go back West (W), or North (N)");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("W")) {
                return 2;  // will call method roomTwo from inside main()
            } else if (answer.equalsIgnoreCase("n")) {
                return 7; // will call method roomSeven from inside main()
            } else {
                System.out.println("Please enter a valid choice (W: West to room 2, N: to room 7): ");
            }
        } //end while loop - room 4

    } //end- roomFour method

    public static int roomFive() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        System.out.println("Welcome to room 5, the dining room.");
        System.out.println("You see some dust and an empty box.");
        System.out.println("You can only go back the way you came (S).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("s")) {
                return 3;  // will call method roomTwo from inside main()
            } else {
                System.out.println("Please enter a valid choice (S: South): ");
            }
        }

    } // end room five method

    public static int roomSix() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

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
            System.out.println("You can go East (E) to room 7 or East to the Secret Room (*)!");
            while (true) {
                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase("e")) {
                    return 7;
                } else if (answer.equalsIgnoreCase("*")) {
                    return 8; // will call method roomSeven from inside main()
                } else {
                    System.out.println("Please enter a valid choice (E: East to room 7, *: East to the Secret Room!): ");
                }
            } //end while loop :: secret open !! :)
        }
        else {
            System.out.println("You can go East (E) to room 7.");
            while (true) {
                answer = keyboard.nextLine();
                if (answer.equalsIgnoreCase("e")) {
                    return 7;
                } else {
                    System.out.println("Please enter a valid choice (E: East to room 7): ");
                }
            } //end while loop :: secret NOT open
        } // end if-else whether secret room is available or not

    } // end room six method


    public static int roomSeven() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        System.out.println("Welcome to room 7, the parlor room.");
        System.out.println("You see a treasure chest.");
        System.out.println("You can go West (W), or South (S)");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("W")) {
                return 6;  // will call method roomSix from inside main()
            } else if (answer.equalsIgnoreCase("S")) {
                return 4; // will call method roomFour from inside main()
            } else {
                System.out.println("Please enter a valid choice (W: West to room 6, S: to room 4): ");
            }
        } //end while loop - room 7

    } //end- roomSeven method

    public static int roomEight() {
        Scanner keyboard = new Scanner(System.in);
        String answer;

        System.out.println("Welcome to room 8, the secret room.");
        System.out.println("You see piles of gold!.");
        System.out.println("You can only go West(W).");

        while (true) {
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("W")) {
                return 6;  // will call method roomSix from inside main()
            } else {
                System.out.println("Please enter a valid choice (W: West): ");
            }
        }

    } // end room eight method

}//end main class
