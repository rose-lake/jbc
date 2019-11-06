import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Car> carList = new ArrayList<>();
        boolean play = true;
        String userStr;
        double userDbl;

        System.out.println("Would you like to create a car? (y/n)");
        userStr = keyboard.nextLine();
        if (userStr.equalsIgnoreCase("n")) {play = false;}
        while(play) {

            // make a temporary loop-only Car
            Car loopCar = new Car();

            // request all components of Car and save the info into loopCar
            System.out.println("Please enter the name/type of the car:");
            userStr = keyboard.nextLine();
            loopCar.setName(userStr);
            System.out.println("Please enter the color of the car:");
            userStr = keyboard.nextLine();
            loopCar.setColor(userStr);
            System.out.println("Please enter the speed of the car as a double:");
            userDbl = keyboard.nextDouble();
            keyboard.nextLine();
            loopCar.setSpeed(userDbl);      // ignore the return String

            // add the loopCar to the ArrayList<Car>
            carList.add(loopCar);

            // play again?
            System.out.println("Would you like to create another car? (y/n)");
            userStr = keyboard.nextLine();
            if (userStr.equalsIgnoreCase("n")) {play = false;}
        }

        // display cars
        System.out.println("\n\nHere are all the cars you created!");
        for (Car c : carList) {
            System.out.println(c.getDescription());
        }

        System.out.println("\n\nSo long! That was fun!");
    }

}
