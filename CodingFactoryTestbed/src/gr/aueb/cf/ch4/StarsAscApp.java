package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει τα αστεράκια που έχει λάβει
 * από τον χρήστη από το stdin
 * 1 x N φορές.
 */
public class StarsAscApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please enter how many stars you would like to get printed.");
        inputNum = scanner.nextInt();

        for (int i = 1; i <= inputNum; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
