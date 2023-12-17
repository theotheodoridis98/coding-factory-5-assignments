package gr.aueb.cf.ch6;

import java.util.Scanner;
/**
 * Ελέγχει τους έξι ακέραιους που εισάγει ο χρήστης,
 * εάν αυτοί οι αριθμοί περνάνε από διάφορα επιμέρους
 * predicates (φίλτρα).
 */
public class FilteringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Εισαγάγετε έξι ακέραιους από 1 έως 49.");
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Αριθμός " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();

            if (arr[i] < 1 || arr[i] > 49) {
                System.out.println("Εισαγάγετε έγκυρο αριθμό από 1 έως 49.");
                i--;
            }

        }

        System.out.println(" ");
        System.out.println(
                        "1. Δεν έχει πάνω από 3 άρτιους: " + hasLessThanThreeEvenNumbers(arr) + "\n" +
                        "2. Δεν έχει πάνω από 3 περιττούς: " + hasLessThanThreeOddNumbers(arr) + "\n" +
                        "3. Δεν έχει πάνω από 3 συνεχόμενους: " + hasLessThanThreeConsecutiveNumbers(arr) + "\n" +
                        "4. Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα: " + hasLessThanThreeSameEndingNumbers(arr) + "\n" +
                        "5. Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα: " + hasLessThanThreeNumbersInSetsOfTens(arr)
        );
    }

    /**
     * Ελέγχει εάν ο συνδυασμός των αριθμών που έδωσε ο χρήστης:
     * Δεν έχει πάνω από 3 άρτιους.
     * @param arr       ο πίνακας
     * @return          evenNumbers = true ή false.
     */
    public static boolean hasLessThanThreeEvenNumbers (int[] arr){
        if (arr == null) return false;
        int evenNumbers = 0;
        for (int element : arr){
            if (element % 2 == 0)
                evenNumbers++;
        }
        return evenNumbers < 3;
    }

    /**
     * Ελέγχει εάν ο συνδυασμός των αριθμών που έδωσε ο χρήστης:
     * Δεν έχει πάνω από 3 περιττούς.
     * @param arr       ο πίνακας.
     * @return          oddNumbers = true ή false.
     */
    public static boolean hasLessThanThreeOddNumbers (int[] arr){
        if (arr == null) return false;
        int oddNumbers = 0;
        for (int element : arr){
            if (element % 2 != 0)
                oddNumbers++;
        }
        return oddNumbers < 3;
    }

    /**
     * Ελέγχει εάν ο συνδυασμός των αριθμών που έδωσε ο χρήστης:
     * Δεν έχει πάνω από 3 συνεχόμενους.
     * @param arr       ο πίνακας.
     * @return          consecutiveNumbers = true ή false.
     */
    public static boolean hasLessThanThreeConsecutiveNumbers (int[] arr){
        if (arr == null) return false;
        int consecutiveNumbers = 0;
        for (int i = 0; i < arr.length - 3; i++){
            if ((arr[i] == arr[i + 1] - 1) && (arr[i] == arr[i + 2] - 2) && (arr[i] == arr[i + 3] - 3))
                consecutiveNumbers++;
        }
        return consecutiveNumbers < 3;
    }

    /**
     * Ελέγχει εάν ο συνδυασμός των αριθμών που έδωσε ο χρήστης:
     * Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα.
     * @param arr       ο πίνακας
     * @return          countOfNumbers = true ή false.
     */
    public static boolean hasLessThanThreeSameEndingNumbers(int[] arr){
        if (arr == null ) return false;

        int countOfSameEndingNumbers = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] % 10 == arr[j] % 10) {
                    countOfSameEndingNumbers++;
                    if (countOfSameEndingNumbers >= 3) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Ελέγχει εάν ο συνδυασμός των αριθμών που έδωσε ο χρήστης:
     * Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα.
     * @param arr       ο πίνακας.
     * @return          countOfNumbers = true ή false.
     */
    public static boolean hasLessThanThreeNumbersInSetsOfTens(int[] arr) {
        if (arr == null) return false;

        int countOfNumbers = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] / 10 == arr[j] / 10) {
                    countOfNumbers++;
                    if (countOfNumbers >= 3) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
