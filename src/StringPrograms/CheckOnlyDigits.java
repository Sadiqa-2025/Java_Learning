package StringPrograms;
/*
"Check if a String Contains Only Digits
Input: ""123abc"" → Output: false"
 */

public class CheckOnlyDigits {
    public static void main(String[] args) {
        String s = "12365s";
        boolean flag = true;
        char[] ch = s.toCharArray();
        for(char x : ch){
            if(Character.isAlphabetic(x)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Contains only digits");
        }
        else System.out.println("Does not contain only digits");
    }
}
