package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ExceptionApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        do {
            printMenu();
            try {
                choice = getChoice();
                printChoice(choice);
            } catch (IllegalArgumentException e){
                e.printStackTrace();
                System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        System.out.println("You have exited the program.");
    }
    public static int getChoice() {
        int choice = 0;
        System.out.println("Please insert your choice.");
        while (true){
            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
                break;
            } else
                System.out.println("Incorrect input. Please insert an integer.");
            scanner.nextLine();
            continue;
        }return choice;
    }
    public static void printMenu() {
        System.out.println("1. First Option");
        System.out.println("2. Second Option");
        System.out.println("3. Third Option");
        System.out.println("4. Fourth Option");
        System.out.println("5. Exit Program");
    }
    public static void printChoice(int choice){
        if (choice < 1 || choice > 5){
            throw new IllegalArgumentException();
        }
        System.out.println("Your choice is: " + choice);
    }
}
