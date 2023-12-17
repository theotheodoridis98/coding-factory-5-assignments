package gr.aueb.cf.ch6;

/**
 * Επιστρέφει τη θέση στον πίνακα array
 * του μέγιστου στοιχείου του πίνακα.
 */
public class ArrayMaxApp {
    public static void main(String[] args) {
        int[] array = new int[] {10, 789, 5, 4, 335, 1, 7, 8, 777, 98};
        int maxPosition = 0;
        maxPosition = getMaxPosition(array, 0, 9);
        System.out.println(array[maxPosition]);
        System.out.println(maxPosition + 1);
    }

    /**
     *
     * @param array     ο πίνακας
     * @param low       το αρχικό index από το οποίο ξεκινάμε την αναζήτηση.
     * @param high      το τελευταίο index από το οποίο τελείωνουμε την αναζήτηση.
     * @return          Η θέση του μέγιστου σημείου στον πίνακα
     */
    public static int getMaxPosition (int[] array, int low, int high){

        int maxPosition = low;
        int maxValue;

        if (low < 0 || high < array.length -1) {
            System.out.println("Invalid search area.");
            return -1;
        }

        maxValue = array[low];
        for (int i = low; i <= high; i++){
            if (array[i] > maxValue){
                maxPosition = i;
                maxValue = array[maxPosition];
            }
        }
        return maxPosition;
    }
}
