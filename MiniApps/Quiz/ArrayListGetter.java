import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListGetter {

	public static void main(String[] args) {
	
		ArrayList<String> newList = new ArrayList<>();
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter 13 words on one line, separated by whitespace.");
		Scanner readWords = new Scanner(keyboard.nextLine());
		while(readWords.hasNext()){
			newList.add(readWords.next());
		}
		
		// note: as a feature, this code can handle any number of entries
		// to handle exactly thirteen, process in a for loop:
		//for (int i = 0; i < 13; i++) {
		//	newList.add(readWords.next());
		//}

		System.out.println("Thanks! You entered...");
		System.out.println(Arrays.toString(newList.toArray()));
		keyboard.close();
	
	}

}