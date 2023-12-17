package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει έναν αριθμό από το 1 εώς το 5 από το stdin
 * και αναλόγως προβάλλει το κατάλληλο feedback
 * Ο αριθμός 5 (sentinel value) μας βγάζει απο το
 * μενού.
 */
public class MenuExerciseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;

        do {
            System.out.println("Για feedback επιλέξτε έναν από τους παρακάτω αριθμούς\n" +
                    "1. Εισαγωγή.\n" +
                    "2. Διαγραφή.\n" +
                    "3. Ενημέρωση.\n" +
                    "4. Αναζήτηση.\n" +
                    "5. Έξοδος.");
            inputNumber = scanner.nextInt();

            if (inputNumber == 1){
                System.out.println("Επιλέξατε το μενού της εισαγωγής.");
            } else if (inputNumber == 2) {
                System.out.println("Επιλέξατε το μενού της διαγραφής.");
            } else if (inputNumber == 3) {
                System.out.println("Επιλέξατε το μενού της ενημέρωσης.");
            } else if (inputNumber == 4) {
                System.out.println("Επιλέξατε το μενού της αναζήτησης.");
            } else
                System.out.println("Επιλέξατε λάθος αριθμό.");
        } while (inputNumber != 5);
    }
}
