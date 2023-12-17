package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει μια χρονιά από το stdin
 * και αξιολογεί εάν η χρονιά αυτή
 * είναι δίσεκτη.
 */
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = 0;
        boolean isLeapYear = true;
        boolean isDivided4 = false;
        boolean isDivided100 = false;
        boolean isDivided400 = false;

        System.out.println("Please insert a year.");
        inputYear = scanner.nextInt();

        isDivided4 = inputYear % 4 == 0;
        isDivided100 = inputYear % 100 == 0;
        isDivided400 = inputYear % 400 == 0;


        if (isDivided4) {
            System.out.println("This is a leap year: " + isLeapYear);
        } else if (isDivided100) {
            isLeapYear = false;
            System.out.println("This is a leap year: " + isLeapYear);
        } else if (isDivided400) {
            isLeapYear = true;
            System.out.println("This is a leap year: " + isLeapYear);
        } else {
            isLeapYear = false;
            System.out.println("This is a leap year: " + isLeapYear);
        }
    }
}
