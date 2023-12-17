package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού στον χρήστη και πράττει
 * ανάλογα με το input που δίνει ο χρήστης
 * από το stdin.
 */
public class StarsApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int userChoice = 0;     //όπου countOfStars υποδηλώνει το πλήθος των αστεριών, δηλαδή το n
        int countOfStars = 0;

        do {
            getMenu();
            userChoice = getUserChoice();

            if (userChoice < 1 || userChoice > 6){
                System.out.println("Άκυρη επιλογή");
                continue;
            } else if (!(userChoice < 1 || userChoice > 5) ) {
                System.out.println("Επιλέξτε το πλήθος των αστεριών που επιθυμείτε.");
                countOfStars = getUserCount();
            } else if (userChoice==6)
                System.out.println("Έξοδος.");

            switch (userChoice){
                case 1: printStarsHorizontally(countOfStars);
                break;
                case 2: printStarsVertically(countOfStars);
                break;
                case 3: printBoxOfStars(countOfStars);
                break;
                case 4: printStarsAscending(countOfStars);
                break;
                case 5: printStarsDescending(countOfStars);
                default:
                    System.out.println("Τερματισμός προγράμματος.");
                    break;
            }

        }while (userChoice !=6) ;
    }
    /*
    Μέθοδοι
     */
    public static int getUserCount (){ return scanner.nextInt();
    }
    public static int getUserChoice (){
        return scanner.nextInt();
    }
    public static void getMenu(){
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια\n" +
                "2. Εμφάνισε n αστεράκια κάθετα\n" +
                "3. Εμφάνισε n γραμμές με n αστεράκια \n" +
                "4. Εμφάνισε n γραμμές με αστεράκια 1 – n\n" +
                "5. Εμφάνισε n γραμμές με αστεράκια n – 1\n" +
                "6. Έξοδος από το πρόγραμμα\n" +
                "Δώσε επιλογή: ");
    }
    public static void printStarsHorizontally(int countOfStars) {
        for (int i = 1; i <= countOfStars; i++){
            System.out.print("* ");
        }
        System.out.println(" ");
    }
    public static void printStarsVertically(int countOfStars){
        for (int i = 1; i <= countOfStars; i++){
            System.out.println("* ");
        }
        System.out.println(" ");

    }
    public static void printBoxOfStars(int countOfStars){
        for (int i = 1; i <= countOfStars; i++){
            for (int j =1; j <= countOfStars; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void printStarsAscending (int countOfStars){
        for (int i = 1; i <= countOfStars; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void printStarsDescending (int countOfStars){
        for (int i = 1; i <= countOfStars; i++){
            for (int j = countOfStars; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}

