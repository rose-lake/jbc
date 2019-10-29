/* HashMap Assignment from canvas
* Ksenia Lake
* Tuesday, October 29, 2019
*/

/*
Prompt user to enter a number and print out the word value. 
Example:

Prompt: Enter a number: 10 Response: You entered ten.

If number is not found ( use myMap.containsKey(10) ) then prompt user to tell the map to add that to the map.

Add the key and value to the map with the following line of code:

myMap.put(10,"ten");

Retrieve the value with

String value = myMap.get(10)
*/

import java.util.HashMap;
import java.util.Scanner;

public class HashMapAssignment {

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		myMap.put(1, "one");
		myMap.put(2, "two");
		myMap.put(3, "three");
		myMap.put(4, "four");
		myMap.put(5, "five");

		String answer;
		Integer userInt;
		String userStr;
		
		while(true) {
			System.out.println("Please enter an integer, or \"Q\" to quit:");
			answer = keyboard.nextLine();
			
			try { // see if an integer was entered
				userInt = Integer.parseInt(answer);
				if(myMap.containsKey(userInt)) {
					System.out.println("You entered " + myMap.get(userInt) + ".");
				} 
				else {
					System.out.println("That integer is not in our map!");
					System.out.println("Please add it to our map by entering its string representation:");
					userStr = keyboard.nextLine();    // no error checking on this one! ah!
					myMap.put(userInt, userStr);
					
					// print out our current map:
					System.out.println("Our current map: ");
					for (Integer key : myMap.keySet()) {
						System.out.println("\t" + key + ":" + myMap.get(key));
					}
					
				}
			} 
			catch (NumberFormatException e) {

				if (answer.equalsIgnoreCase("q")) { 
					// actually, the user wants to quit
					break; 
				}
				else {
					// a valid integer was not entered, nor "Q" for quit...
					System.out.println(e.getMessage());
					System.out.println("Please enter a valid integer, or \"Q\" to quit:");
				}
			} // end try-catch on answer-to-int conversion


		} // end "play game loop"
		
	} // end main

} // end class