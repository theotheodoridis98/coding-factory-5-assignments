package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Please insert the temperature in Fahrenheit:");
        fahrenheit = in.nextInt();
        celsius = 5 * ( fahrenheit - 32) / 9;

        System.out.printf("The temperature in Celsius is:\n %d" , celsius);
    }
}
