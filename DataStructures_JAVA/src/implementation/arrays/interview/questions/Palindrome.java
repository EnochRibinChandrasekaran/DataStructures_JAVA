package implementation.arrays.interview.questions;

//For example: radar or madam
//Your task is to design an optimal algorithm for checking whether a given string is palindrome or not!
//Running time : O(N)
public class Palindrome {
    public static void main(String[] args){
        String word = "nmadam";
        System.out.println("The given string :"+word + ", Palindrome :" + palindromeChecker(word));

    }

    private static boolean palindromeChecker(String word) {
        int lowIndex = 0;
        int highIndex = word.length() -1;
        while(lowIndex < highIndex){
            if(word.charAt(lowIndex) != word.charAt(highIndex))
                return false;
            lowIndex++;
            highIndex--;
        }
        return true;
    }

}
