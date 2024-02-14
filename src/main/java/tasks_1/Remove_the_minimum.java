package tasks_1;


//https://www.codewars.com/kata/563cf89eb4747c5fb100001b

import java.util.Arrays;

public class Remove_the_minimum {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 2, 1};
        System.out.println(Arrays.toString(removeSmallest(nums)));
    }

    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0 || numbers.length == 1) {
            return new int[]{};
        }

        int lowestNum = 10;
        int indexOfLowestNumber = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < lowestNum) {
                lowestNum = numbers[i];
                indexOfLowestNumber = i;
            }
        }

        int[] numbersWithMarkedLowestNum = new int[numbers.length];
        for (int i = 0; i < numbersWithMarkedLowestNum.length; i++) {
            if (i == indexOfLowestNumber) {
                numbersWithMarkedLowestNum[i] = -1;
            } else {
                numbersWithMarkedLowestNum[i] = numbers[i];
            }
        }

        int[] outputArray = new int[numbersWithMarkedLowestNum.length - 1];
        for (int i = 0, j = 0; i < numbersWithMarkedLowestNum.length; i++) {
            if (numbersWithMarkedLowestNum[i] != -1) {
                outputArray[j] = numbersWithMarkedLowestNum[i];
                j++;
            }
        }

        return outputArray;
    }
}