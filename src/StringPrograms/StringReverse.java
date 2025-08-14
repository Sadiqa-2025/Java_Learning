package StringPrograms;
/*
"Reverse alternative word:

give string input = ""i am good guy"";
string output = ""i ma good yug"";"
 */

public class StringReverse {

    static String reverse(String input){
        String rev = "";
        for(int i=input.length()-1; i>=0; i--){
            rev = rev + input.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String input = "i am good guy";
        String[] words = input.split(" ");
        String output= "";
        for(int i=0; i< words.length; i++){
            if(i%2!=0){
               output = output+  reverse(words[i]) + " ";
            }
            else{
               output = output + words[i]+ " ";
            }
        }
        System.out.println(output);

    }
}
