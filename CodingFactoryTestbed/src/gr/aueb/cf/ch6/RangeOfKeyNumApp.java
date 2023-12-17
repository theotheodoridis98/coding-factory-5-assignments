package gr.aueb.cf.ch6;

/**
 * Η κλάση παρουσιάζει το εύρος ενός αριθμού
 * δηλαδή το χαμηλότερο και υψηλότερο index
 * μέσα σε έναν ταξινομημένο πίνακα.
 */
public class RangeOfKeyNumApp {
    public static void main(String[] args) {
        int [] array;
        array = new int[] {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int[] result = getLowAndHighIndexOf(array, 4);
        System.out.println("result = {" + result[0] + "," + result[1] + "}");
    }

    /**
     * Η μέθοδος getLowAndHighIndexOf βρίσκει τις
     * θέσεις ενός key αριθμού και τις επιστρέφει στη
     * main σε μορφή πίνακα με δύο θέσεις όπου η
     * πρώτη συμβολίζει το low index του αριθμού
     * και η δεύτερη το high index.
     *
     * @param arr       ο πίνακας
     * @param key       ο αριθμός το οποίου ψάχνουμε το εύρος
     * @return
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key){
        int [] newArray= new int[2];
        int lowIndex = -1;
        int highIndex = -1;
        for (int i = 0; i < arr.length; i++){
            if (key == arr[i]){
                lowIndex = i;
                break;
            }
        }

        for (int j = arr.length - 1; j >= 0; j--){
            if (key == arr[j]){
                highIndex = j;
                break;
            }
        }

        newArray[0] = lowIndex;
        newArray[1] = highIndex;
        return newArray;

    }
}
