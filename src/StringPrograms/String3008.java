package StringPrograms;
/*
Given a String // Input = aabbcccaabbb, expected OutPut1: abcab
 */
public class String3008 {
    public static void main(String[] args) {
        String input = "aabbcccaabbb";
        String output = "";
        output = output+ input.charAt(0);
        for(int i=1; i<input.length(); i++){
          if(input.charAt(i) != input.charAt(i-1)){
              output = output + input.charAt(i);
          }
        }
        System.out.println(output);
    }

}
