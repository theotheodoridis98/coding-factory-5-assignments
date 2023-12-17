package gr.aueb.cf.ch2;

import java.util.Scanner;
import java.lang.Math;

public class Exericse02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;

        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        int yearLastTwoDigits = year % 1000 % 100;

        System.out.printf("%02d / %02d / %02d" , day , month, yearLastTwoDigits);
    }
}
