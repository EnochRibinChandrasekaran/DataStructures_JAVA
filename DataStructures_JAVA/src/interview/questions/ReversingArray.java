package interview.questions;

import java.util.Arrays;

//Reversing an array in-place exercise
//In this exercise, you have to reverse a T[] array in O(N) linear time complexity
//and we want the algorithm to be in-place as well - so the algorithm can not use additional memory!
//For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
public class ReversingArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before reversal :" + Arrays.toString(numbers));
        inPlaceReversal(numbers);
        System.out.println("After reversal : " + Arrays.toString(numbers));
    }

    //O(N)
    private static void inPlaceReversal(int[] numbers) {
        int lowIndex = 0;
        int highIndex = numbers.length - 1;
        while (lowIndex < highIndex) {
            swap(numbers, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }
    }

    private static void swap(int[] numbers, int lowIndex, int highIndex) {
        int temp = numbers[lowIndex];
        numbers[lowIndex] = numbers[highIndex];
        numbers[highIndex] = temp;
    }
}
