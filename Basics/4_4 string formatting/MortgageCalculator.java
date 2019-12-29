/**
 * "What does this code do?"
 * Code Commenting Exercise
 *
 * Ksenia Lake
 * October 24, 2019
 */

import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double loanAmount = 0;
        double interestRate = 0;
        double monthlyPayment = 0;
        double balance = 0;
        int termYears = 0;

        // get the user input and close the resource when done
        System.out.println("Enter the loan amount: ");
        loanAmount = keyboard.nextDouble();
        System.out.println("Enter the interest rate on the loan: ");
        interestRate = keyboard.nextDouble();
        System.out.println("Enter the term (years) for the loan payment: ");
        termYears = keyboard.nextInt();
        keyboard.close();

        // do the calculations
        // calculate monthly payment
        monthlyPayment = calculateMonthlyPayment(loanAmount, interestRate, termYears);
        // calculate TOTAL owed to bank, assuming monthly payments (and no overpaying)
        balance = -(monthlyPayment * (termYears * 12));

        // print out the monthly payment and total owed to bank in nicely formatted way:
        System.out.println("\n=========================================\n");
        System.out.format("%-30s$%+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%+10.2f%n", "Minimum monthly payment: ", monthlyPayment);
        System.out.println("\n=========================================\n");
        /* ***************************************************************
         * EXPLANATION OF .format() SPECIAL FORMATTING CODE
         *
         * ORIGINAL CODE:
         * System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
         * System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthlyPayment);
         *
         * STRING FORMAT SPECIFIERS:
         * % means what comes after is special info for formatting the string
         * %s formats whatever comes next as a string
         * %f formats a float
         * %n output a platform-specific new-line character
         *
         * FANCY STUFF
         * %-30s        [-] means left-justify
         *              then, [30] means print the string within a total space of 30 characters,
         *              and then [s] means do all that to the string that follows as argument
         *
         * $            is an ACTUAL DOLLAR SIGN (!) in this case!
         *
         * %+-10.2f     the [+] means print with a pos/neg sign
         *              the [-] means left-justify
         *              [10] means it will format with a minimum total width of 10 chars
         *              and [.2] means post-decimal point precision of 2
         *              and then [f] means do all this to the float that follows as an argument.
         *
         * MY FIX:
         * So, I took out the '-' from the float formatting string because, honestly,
         * who left-justifies currency??? So now the currency portion is right-justified
         * and it just makes more sense on the screen... I added a few more '=' to the
         * header string as well so it all lines up.
         */
    }


    /* *****************************************************************************
     *  This function calculates the monthly payment you can expect to make
     *  based on the total loan amount (loanAmount),
     *  the interest rate (interestRate) given as an integer (not a decimal value)
     *  and the length of the loan term, in years (termYears).
     * ****************************************************************************/
    private static double calculateMonthlyPayment(double loanAmount, double interestRate, int termYears) {
        double ratePerMonth = (interestRate / 100) / 12;
        double base = (1 + ratePerMonth);
        double months = termYears * 12;
        double result = 0.0;

//        // my exploratory code
//        double totalInterestOwed = ratePerMonth * loanAmount;
//        result = loanAmount + totalInterestOwed;
//        System.out.println("my result: " + result);

        // I did some research to try to understand the details of this result formula (below)
        // but didn't get very far. I stopped when I got to "discount factor"s.
        result = ((ratePerMonth * loanAmount) / (1 - Math.pow(base, -months)));
        return result;
    }
}

