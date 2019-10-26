/**
 * String Escape Sequences (and Formatting!) exercise
 *
 * Ksenia Lake
 * October 25, 2019
 *
 * Write a Java program to print the following columns of values. Use \t for the tabs between the columns.
 * Cost      Quantity   Total
 * $1,000.00   4       $4,000.00
 * $   50.00   8         $400.00
 * ______________________________
 * TOTAL:      12      $4,400.00
 */

public class JavaDay5Ex4 {

    public static void main(String[] args) {

        // declare
        int qty1 = 4, qty2 = 8, qtyTotal;
        float cost1 = 1000, cost2 = 50, total1, total2, finalTotal;

        // row totals :: calculate
        total1 = cost1 * qty1;
        total2 = cost2 * qty2;

        // column totals :: calculate
        qtyTotal = qty1 + qty2;
        finalTotal = total1 + total2;

        // pre-Format
        // NOTE: tabs = 4 spaces each
        System.out.printf("Cost\t\tQuantity\tTotal%n");
        // rows
        System.out.printf("$%,8.2f\t%d\t\t$%,8.2f%n", cost1, qty1, total1);
        System.out.printf("$%,8.2f\t%d\t\t$%,8.2f%n", cost2, qty2, total2);
        // post-Format
        System.out.printf("______________________________%n");
        System.out.printf("TOTAL:\t\t%d\t\t$%,.2f%n", qtyTotal, finalTotal);
    }

}
