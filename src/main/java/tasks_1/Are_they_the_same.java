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

//check if b array have negative number
        for(int i = 0; i < b.length; i++){
            if(b[i] < 0){
                return false;  //a negative number cant be square rooted
            }
        }

//create new arrays to comparsion
        int[] rootedA = new int [a.length];
        int[] rootedSquareB = new int [b.length];


    //seems good but its not helping.
//check duplicates
        int duplicatesA = 0;
        int duplicatesB = 0;

//how many duplicates A
        for(int i = 1; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                if(a[i-1] == a[j]){
                    duplicatesA++;
                    break;
                }
            }
        }

//how many duplicates B
        for(int i = 1; i < b.length; i++){
            for(int j = i; j < b.length; j++){
                if(b[i-1] == b[j]){
                    duplicatesB++;
                    break;
                }
            }
        }

        if(duplicatesA != duplicatesB){
            return false;
        }


//a square
        for(int i = 0; i < a.length; i++){
            rootedA[i] = a[i] * a[i];
        }

//b square root
        for(int i = 0; i < b.length; i++){
            rootedSquareB[i] = (int) Math.sqrt(b[i]);
        }

        Arrays.sort(rootedA);
        Arrays.sort(rootedSquareB);
        Arrays.sort(a);
        Arrays.sort(b);

/*
//check rootedA to b
        for(int i = 0; i < rootedA.length; i++){
            if(rootedA[i] == b[i]){
            }else{
                return false;
            }
        }
 */

        return Arrays.equals(rootedA,b);
    }
}
