package implementation.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListManipulation {
    public static void main(String[] args) {
        // main reason to use arraylist instead of array is the dynamic length
        List<Integer> numbers = new ArrayList<>();
        //O(1) for adding new
        //O(N) is resizing is required
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers.toString());

        //O(N) because shifting of elements is required
        numbers.add(2, 7);

        System.out.println("added new item in index 2 :"+numbers.toString());


        //O(1) for getting element based on index
        System.out.println("Second index :" + numbers.get(2));

        //O(N) for all remove function because shifting is required
        System.out.println("Remove element 5:" + numbers.remove(5));

        System.out.println(numbers.toString());
    }

}
