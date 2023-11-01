package tasks_1;

import java.util.Scanner;

public class Return_Negative {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        System.out.println(makeNegative(number));

        
    }
    
    public static int makeNegative(final int x){
        int reverseSign;

        if(x == 0){
            return 0;
        }else if (x < 0){
            return x;
        }else{
            reverseSign = x -x -x;
            return reverseSign;
        }
    }
}
