package implementation;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 1;
        numbers[4] = 1;

        System.out.println(Arrays.toString(numbers));
        //O(1)
        System.out.println(" Search by Index : " + searchByIndex(numbers, 1));

        addItemAtEnd(numbers, 6);
        System.out.println("addItemAtEnd :" + Arrays.toString(numbers));

        removeItemAtEnd(numbers);
        System.out.println("removeItemAtEnd :" + Arrays.toString(numbers));

        //O(N)

        System.out.println(" Search by value : " + find(numbers, 2));
        numbers = addItemAtStart(numbers, 10);

        System.out.println("addItemAtStart :" + Arrays.toString(numbers));
        removeItemByIndex(numbers, 2);

        System.out.println("removeItemByIndex :" + Arrays.toString(numbers));
        //O(N^2)
        removeItemByValue(numbers, 2);

        System.out.println("removeItemByValue :" + Arrays.toString(numbers));

    }

    private static int searchByIndex(int[] numbers, int index) {
        if (numbers.length < index) return -1;
        else return numbers[index];
    }

    private static void addItemAtEnd(int[] numbers, int value) {
        numbers[numbers.length - 1] = value;
    }

    private static void removeItemAtEnd(int[] numbers) {
        numbers[numbers.length - 1] = 0;
    }

    private static int find(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) return i;
        }
        return -1;
    }

    private static int[] addItemAtStart(int[] numbers, int value) {
        int[] tempArray  = numbers;
        int[] newArray = new int[numbers.length + 2];
        newArray[0] = value;
        int numberIndex = 1;
        for (int i = 0; i < numbers.length; i++) {
            newArray[numberIndex ++] = tempArray[i];
        }
        return newArray;
    }

    private static void removeItemByIndex(int[] numbers, int index) {

        for (int i = index; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
    }

    private static void removeItemByValue(int[] numbers, int value) {
        int index = find(numbers, value);
        removeItemByIndex(numbers, index);
    }
}
