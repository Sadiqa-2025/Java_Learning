package StringPrograms;
/**  "Write a program to find the first non-repeating character in a string without using Collections.
 input: String s = ""abbccddeff"";
 output: a"
  */

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "abbccddeff";
        int count = 1;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            for(int j=1; j<s.length()-1; j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    count++;
                }
                if(count==1){
                    System.out.println(s.charAt(i));
                    break;
                }
                break;
            }
            break;
        }
    }
}
