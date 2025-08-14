package StringPrograms;
/*
"find the given string is palindrome without using Array or Loop
    input: OUTPUT
    output: Not Palindrome
    Input: ABCDCBA
    output: Palindrome"
 */
public class PalindromeString {
    static void checkPalindrome(String input){

        String res = "";
        for(int i=input.length()-1; i>=0; i--){
            res = res + input.charAt(i);
        }
        if(input.equals(res)){
            System.out.println("Palindrome");
        }
        else System.out.println("Not palindrome");
    }
    public static void main(String[] args) {
        String input1= "OUTPUT";
        String input2 = "ABCDCBA";
        checkPalindrome(input1);
        checkPalindrome(input2);
    }
}
