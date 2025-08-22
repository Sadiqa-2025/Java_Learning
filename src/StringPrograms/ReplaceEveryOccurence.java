package StringPrograms;
/*
"Replace every occurrence of a particular character specified as an array element with ‘*’ in a given string

Input: String: ""hello world"", char[] ch = {'l','o'}

Output: ""he*** w*r*d"""
 */
public class ReplaceEveryOccurence {
    public static void main(String[] args) {
        String input = "hello world";
        char[] ch = {'l', 'o'};
        String result = "";

        //check the elements of char[] is present in input.charAt()
        for(int i=0; i<ch.length; i++){
           input = input.replace(ch[i], '*');
        }
        System.out.println(input);
    }
}
