package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει τα αστεράκια που έχει λάβει
 * από τον χρήστη από το stdin
 * N x 1 φορές.
 */
public class StarsDescApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please enter how many stars you would like to get printed.");
        inputNum = scanner.nextInt();

        for (int i = 1; i <= inputNum; i++) {
            for (int j = inputNum; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}