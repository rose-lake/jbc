/**
 * String Formatting Examples
 * Ksenia Lake
 * October 25, 2019
 *
 * Java program to demonstrate How to format String in Java by using
 * format() method of String class and printf() method of OutputStream in Java.
 * String.format() is very powerful and not only can format String but numbers
 * and Date in Java
 */

package com.company;
import java.util.Date;

public class JavaDay5Ex2 {

    public static void main(String args[]){

        //simple example of formatted string in Java
        //%d is used to format decimals like integers
        //position of argument is the order in which they appear in source String
        // e.g here 40021 will replace first %d and 3000 will replace second %d.
        int id = 40021;
        int amt = 3000;
        String myName = "Dave";

        System.out.println("Order with OrdId : " + id + " and Amount: " + amt);
        String formattedString = String.format("Order with OrdId : %d and Amount: %d", id, amt);
        System.out.println(formattedString);

        System.out.printf("Order with OrdId : %d and Amount: %d is missing \n", id, amt);

        //%s is used to denote String arguments in formatted String
        String str = String.format("Hello %s", myName);
        System.out.println(str);

        //Formatting date in String format method - date in MM/dd/yy
        str = String.format("Today is %tD", new Date());
        System.out.println(str);

        Date today = new Date();
        System.out.printf("Date in dd/mm/yy format %td/%tm/%ty %n", today,today,today );

        // date as July 25, 2012, difference between %td and %te is that
        // %td use leading zero while %te doesn't
        System.out.printf("Today is %tB %te, %tY %n", today,today,today);

        //adding leading zero in numbers using String format,
        //%d is for decimal, 8 specify formatted number should be 8 digit and 0 specify use
        //leading zero, default is space, so if you don't specify leading
        // character space will be used.
        System.out.printf("Amount : %08d %n" , 221);

        //adding comma into long numbers
        System.out.printf("Total %,d messages processed today", 10000000);

    }

}
