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
import java.util.Arrays;   // just in case ;)
import java.util.Random;

public class Movies{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> movieList = new ArrayList<>();
        String answer;

        // request user input:
        do {
            System.out.println("Please enter the name of a movie, or \"Q\" to quit:");
            answer = keyboard.nextLine();
            movieList.add(answer);
        } while (!answer.equalsIgnoreCase("q"));

        keyboard.close();
        System.out.println(Arrays.toString(intList.toArray()));


    }
}
