package tasks_1;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        System.out.println(isLeapYear(year));


    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
