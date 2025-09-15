package Logical_Patterns;
/*
* "input: String str = ""Test45@W"";
output: West45@T"
* */
public class SwapChar01 {
    public static void main(String[] args) {
        String s = "Test45@W";
        String sub = s.substring(1,s.length()-1);
      //  System.out.println(sub);
        String result = s.charAt(s.length()-1)+ sub +s.charAt(0);
        System.out.println(result);

    }
}
