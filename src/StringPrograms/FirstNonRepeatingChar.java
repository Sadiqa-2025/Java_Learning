package StringPrograms;
/**  "Write a program to find the first non-repeating character in a string without using Collections.
 input: String s = ""abbccddeff"";
 output: a"
  */

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
       // String s = "abbccddeff";
        String s = "abbccddef";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            boolean unique = true;
            for(int j=0; j<s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    unique = false;
                    break;
                }
            }
                if(unique == true){
                    System.out.println(s.charAt(i));
                    break;
                }
            }
        }

}
