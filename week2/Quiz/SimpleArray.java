import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {

		int[] numArray = new int[20];
		Scanner keyboard = new Scanner(System.in);
		int userInt;
		
		System.out.println("Please enter 20 integers, one at a time...");
		for (int i = 0; i < 20; i++) {
			System.out.print("int #" + (i+1) + ": ");
			userInt = keyboard.nextInt();
			numArray[i] = userInt;
		}
		
		System.out.println("Thanks! You entered...");
		System.out.println(Arrays.toString(numArray));
		
		keyboard.close();

	}

}