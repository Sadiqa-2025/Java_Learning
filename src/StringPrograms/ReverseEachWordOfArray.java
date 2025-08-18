package StringPrograms;
/*
"Given an array of words, reverse each word and store in a new array

Input: String[] words = {""apple"", ""banana"", ""cat""}

Output: {""elppa"", ""ananab"", ""tac""}"
 */
public class ReverseEachWordOfArray {

    static String reverse(String words){
        String rev = " ";
        for(int i=words.length()-1;i>=0; i--){
            rev = rev + words.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String[] input = {"apple", "banana", "cat"};
        String[] output = new String[3];
        int j= 2;
        for(int i=input.length-1; i>=0; i--){
           output[j] =  reverse(input[i]);
           j--;
        }

        //read the elements of output array
        for(String x: output){
            System.out.print(x+ " ");
        }

    }
}
