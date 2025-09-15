package Logical_Patterns;
/*
"input- This is a tcs interview
 output- weivretni tcs a si sihT"
* */


public class Pattern02 {
    public static void main(String[] args) {
        String s = "This is a tcs interview";
        String rev="";
        for(int i=s.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
