package tasks_1;

import java.util.Scanner;

public class Even_or_Odd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(evenOrOdd(number));
    }

    public static String evenOrOdd(int number){
        if(number % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}
