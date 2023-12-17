package gr.aueb.cf.ch6;

/**
 * Βρίσκει το 2ο μικρότερο στοιχείο ενός πίνακα.
 */
public class ArraySecondMinApp {
    public static void main(String[] args) {
        int [] arr;
        arr = new int[] {15, 8, 55, 44, 66, 98, 12, 54, 48, 13, 52};
        System.out.println(getSecondSmallestNum(arr));
    }

    public static int getSecondSmallestNum(int[] arr){


        for (int i = 0; i < arr.length; i++){
            int min = arr[i];
            int minPosition = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    minPosition = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = temp;
        }
        return arr[1];
    }
}
