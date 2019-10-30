import java.util.Scanner;
import java.util.Random;

public class RandomNum{
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int start, end, randomInt;
		
		System.out.println("Welcome to Random Generator!");
		
		System.out.print("Please enter the beginning of your range as an integer (inclusive): ");
		start = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.print("Please enter the end of your range as an integer (inclusive): ");
		end = keyboard.nextInt();
		keyboard.nextLine();
		
		// test loop ::
		//for (int i = 0; i < 20; i++) {
		//	randomInt = getRandomInt(start, end);
		//	System.out.println("Thanks!\nYour random integer in the range from"
		//					+ start + " to " + end + " is: " + randomInt);
		//}
		
		randomInt = getRandomInt(start, end);
		System.out.println("Thanks!\nYour random integer in the range from"
							+ start + " to " + end + " is: " + randomInt);
		
		System.out.println("Goodbye!");
		keyboard.close();		

	}

	private static int getRandomInt(int start, int end) {
		Random randomGenerator = new Random();
		int returnValue, range;
		range = end - start + 1;   // assume end > start. add one for range to be inclusive of bounds.
		returnValue = randomGenerator.nextInt(range) + start;
		return returnValue;
	}
}