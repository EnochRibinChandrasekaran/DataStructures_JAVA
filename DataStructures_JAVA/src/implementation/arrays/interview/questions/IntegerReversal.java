package implementation.arrays.interview.questions;

//Your task is to design an efficient algorithm to reverse a given integer.
// For example if the input of the algorithm is 1234 then the output should be 4321.
//NOTE: the input is an integer (and not a string) !!!
//Run time = O(logN)
public class IntegerReversal {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(number + "reversed value is :" + integerReversal(number));
    }

    private static int integerReversal(int number) {
        int reversed = 0;
        //O(logN) - each time we divide the number by 10
        //f(n) = log10N removing constant 10
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
}
