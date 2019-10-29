/**
* Movies (ArrayLists)
* exercise from canvas.
*
* Ksenia Lake
* October 29, 2019
*/

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Movies{
	
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> movieList = new ArrayList<>();
        String answer;

        // request user input:
        while (true) {
            System.out.println("Please enter the name of a movie, or \"Q\" to quit:");
			answer = keyboard.nextLine();
			if (!answer.equalsIgnoreCase("q")) {
				movieList.add(answer);
			}
			else {
				break;
			}
		}

		// print out the user-generated movie List
        System.out.println(Arrays.toString(movieList.toArray()));
		
		// print it out in alphabetical order
		Collections.sort(movieList);
		System.out.println(Arrays.toString(movieList.toArray()));
		
		// randomly choose one to suggest to the user
		Collections.shuffle(movieList);
		System.out.println("You should watch a movie! How about " + movieList.get(0) + "?");
		
		// close your resource
		keyboard.close();
        
    } // end main
	
} // end class
