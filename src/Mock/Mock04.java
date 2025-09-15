package Mock;
/*
"Reverse Each Word in a Sentence
Input: ""hello world"" → Output: ""olleh dlrow"""
 */
public class Mock04 {

    public static String reverse(String words){
        String rev = "";
        for(int i=words.length()-1;i>=0;i-- ){
            rev = rev + words.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String s = "hello world";
        String[] words = s.split(" ");
        String output = "";

        for(String x: words){
            output = output + reverse(x)+ " ";
        }
        System.out.println(output);
    }
}
