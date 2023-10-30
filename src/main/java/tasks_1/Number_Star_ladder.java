package tasks_1;

// https://www.codewars.com/kata/5631213916d70a0979000066

import java.util.Scanner;

public class Number_Star_ladder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(pattern(n));

    }

    public static String pattern(int n) {
        String output = "";
        int ending_number = 1;
        String asterisk = "*";

        if (n > 0) {
            if (n > 1) {
                for (int i = 0; i < n; i++) {
                    if (ending_number <= 1) {
                        output += "1" + '\n';
                    } else if (ending_number < n) {
                        output += "1" + asterisk + ending_number + '\n';
                        asterisk += "*";
                    } else {
                        output += "1" + asterisk + ending_number;
                    }
                    ending_number++;
                }
            }else if(n == 1){
                output += "1";
            }
        }
        return output;
    }



}