package tasks_1;

import java.util.Scanner;

public class String_ends_with {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.nextLine();
        String ending = scan.nextLine();

        System.out.println(solution(start,ending));

    }

    public static boolean solution(String str, String ending){

        String strSubstring;

        if(str.length() >= ending.length()) {
            int firstPosition = str.length() - ending.length();
            strSubstring = str.substring(firstPosition);
        }else{
            return false;
        }

        if(strSubstring.equals(ending)){
            return true;
        }else{
            return false;
        }
    }
}
