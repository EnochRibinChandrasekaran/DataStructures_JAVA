package implementation.arrays.interview.questions;

import java.util.Arrays;

//Your task is to construct an algorithm to check whether two words (or phrases) are anagrams or not!
//"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once"
//For example: restful and fluster are anagrams.
// Running time : O(NlogN)
public class Anagram {
    public static void main(String[] args) {
        String wordOne = "restful";
        String wordTwo = "fluster";

        System.out.println("Is " + wordOne + " and " + wordTwo + " an Anagram :" + anagramChecker(wordOne.toCharArray(), wordTwo.toCharArray()));


    }

    private static boolean anagramChecker(char[] charArray, char[] charArray1) {
        if (charArray.length != charArray1.length)
            return false;
        //O(NlogN)
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        //O(N)
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray1[i])
                return false;

        }
        return true;
    }

}
