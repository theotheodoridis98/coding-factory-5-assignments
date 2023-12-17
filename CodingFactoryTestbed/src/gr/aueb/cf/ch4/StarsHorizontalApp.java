package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Λαμβάνει απο το stdin το πλήθος
 * των stars που θέλει ο χρήστης
 * να εκτυπωθούν σε οριζόντια μορφή.
 */
public class StarsHorizontalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please enter how many stars you would like to get printed.");
        inputNum = scanner.nextInt();

        for (int i = 1; i <= inputNum; i++) {
            System.out.print("* ");
        }
    }
}
