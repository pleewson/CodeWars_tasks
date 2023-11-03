package tasks_1;

import java.sql.Array;
import java.util.Arrays;

public class Are_they_the_same {

    //passed 9/11 tests
    //* check if number is negative!
    public static void main(String[] args) {

        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 36100, 25921, 361, 20736, 361};

        System.out.println(comp(a,b));
    }


    public static boolean comp(int[] a, int[] b){

//check if any array is null // and if arrays length are the same
        if(a == null || b == null || a.length != b.length){
            return false;
        }

//create new array to comparsion
        int[] rootedA = new int [a.length];

//a square
        for(int i = 0; i < a.length; i++){
            rootedA[i] = a[i] * a[i];
        }

        Arrays.sort(rootedA);
        Arrays.sort(b);

        return Arrays.equals(rootedA,b);
    }
}
