package tasks_1;

public class Are_they_the_same {

    //passed 9/11 tests
    //* check if number is negative!
    public static void main(String[] args) {

        //with some tests method works without second for loop
        //but its always correct.


        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a,b));

    }
    public static boolean comp(int[] a, int[] b){

        if(a == null || b == null){
            return false;
        }

        if(a.length != b.length){
            return false;
        }

        //a checks b values
        for(int i = 0; i < a.length; i++){
            int counter = 0;
            for(int j = 0; j < b.length; j++){
                if(a[i] * a[i] == b[j]) {
                    counter++;
                }
            }
            if(counter == 0){
                return false;
            }
        }

        //b checks a values
        for(int i = 0; i < b.length; i++){
            int counter = 0;
            for(int j = 0; j < a.length; j++){
                if(Math.sqrt(b[i]) == a[j]){
                    counter++;
                }
            }
            if(counter == 0){
                return false;
            }
        }

        return true;
    }
}
