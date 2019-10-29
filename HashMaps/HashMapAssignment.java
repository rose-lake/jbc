/* HashMap Assignment from canvas
* Ksenia Lake
* Tuesday, October 29, 2019


ASSIGNMENT

PART 1: Prompt user to enter a number; print out the word value for that number. 

PART 2: If number is not found, prompt the user to add that integer's string to the map.

PART 3: When the user quits, save the values to a file.

PART 4: When the program runs, load the values from a file.
*/

import java.util.HashMap;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class HashMapAssignment {
	
	private static HashMap<Integer, String> myMap = new HashMap<Integer, String>();
	private static String filename = (System.getProperty("user.dir") 
										+ File.separatorChar 
										+ "IntegerStringHashMap.txt");

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		String answer;
		Integer inputInt;
		String inputStr;
        
		initializeHashMap();			
		System.out.println("Our current map: ");
		for (Integer key : myMap.keySet()) {
			System.out.println("\t" + key + ":" + myMap.get(key));
		}

		// ************************************* 
		//  "play the game" : exit on "Q" only
		// *************************************
		while(true) {
			System.out.println("Please enter an integer, or \"Q\" to quit:");
			answer = keyboard.nextLine();
			
			try { // see if an integer was entered
				inputInt = Integer.parseInt(answer);
				if(myMap.containsKey(inputInt)) {
					System.out.println("You entered " + myMap.get(inputInt) + ".");
				} 
				else {
					System.out.println("That integer is not in our map!");
					System.out.println("Please add it to our map by entering its string representation:");
					inputStr = keyboard.nextLine();    // no error checking on this one! ah!
					myMap.put(inputInt, inputStr);
					
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
		
		
		// *************************************
		// save the current HashMap to a file.
		// *************************************
		PrintWriter writer = null;
		try {
            writer = new PrintWriter(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }
        for (Integer key : myMap.keySet()) {
            writer.println(key + "\t" + myMap.get(key));
        }
        writer.close();
		
		
	} // end main

	private static void initializeHashMap() {

		// **************************************************
		// read-in hashmap values from a file 
		// uses class-level private static variable filename
		// ************************************************
		BufferedReader reader = null;
		Integer inputInt;

		try {
			reader = new BufferedReader(new FileReader(filename));
			String line = reader.readLine();
			while (line != null){
				String[] keyValuePair = line.split("\t");
				// we do not error-handle for if the line has no tab!
				// we also do not error-handle for whether the line has anything other than an EOL character
				System.out.println("key:" + keyValuePair[0] + " value:" + keyValuePair[1]);
				try {
					inputInt = Integer.parseInt(keyValuePair[0]);
					myMap.put(inputInt, keyValuePair[1]);
					line = reader.readLine();
				} catch (NumberFormatException e) {
					System.out.println("Invalid key-value pair format. Skipping ahead to the next line.");
					line = reader.readLine();
				}
			}
		} catch (IOException e) {
			System.out.println("File does not exist! Will create default HashMap.");
		}
		
		if (myMap.isEmpty()) {
			System.out.println("Creating default HashMap...");
			myMap = createMap();
		}

	}

	private static HashMap<Integer, String> createMap() {
		HashMap<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.put(1, "one");
		newMap.put(2, "two");
		newMap.put(3, "three");
		newMap.put(4, "four");
		newMap.put(5, "five");
		return newMap;
	}

} // end class