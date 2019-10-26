/**
* Ksenia Lake
* October 26, 2019
* Write a program to print a String in reverse
*/

import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String userStr;
        char[] charArray;
        int length;

        System.out.println("Please enter a string:");
        userStr = keyboard.nextLine();
        charArray = userStr.toCharArray();
        length = charArray.length;
        for (int i = (length-1); i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();

    }
}
