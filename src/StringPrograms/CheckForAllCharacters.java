package StringPrograms;
/*
"Program to check the String is panagram or not

Defination: A pangram is a sentence containing every letter in the English Alphabet.

Input: “The quick brown fox jumps over the lazy dog”
Output: is a Pangram
Explanation: Contains all the characters from ‘a’ to ‘z’]"
 */
public class CheckForAllCharacters {
    public static void main(String[] args) {
        boolean flag = false;
        String str = "The quick brown fox umps over the lazy dog";
        String newStr = str.toLowerCase();
        for(char letter = 'a'; letter <='z'; letter++) {
            if (newStr.indexOf(letter)== -1) {
               flag = true;
               break;
            }
        }

        if(flag){
            System.out.println("Not pangram");
        }
        else System.out.println("Pangram");

    }
}
