package StringPrograms;
/*
"Replace every occurrence of a particular character specified as an array element with ‘*’ in a given string

Input: String: ""hello world"", char[] ch = {'l','o'}

Output: ""he*** w*r*d"""
 */
public class ReplaceEveryOccurence {

    static String replacedString(String input, char[] ch){
        for(int i=0; i<ch.length; i++){
            input = input.replace(ch[i], '*');
        }
        return input;
    }
    public static void main(String[] args) {
        String input = "hello world";
        char[] ch = {'l', 'o'};
        replacedString(input, ch);
    }
}
