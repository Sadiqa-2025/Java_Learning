package StringPrograms;
/*
"Input: JavApRogr2m
Output: J@@A@R@@@&@"
 */

public class JavApRogr2m {
    public static void main(String[] args) {
        String s= "JavApRogr2m";
        char[]  ch = s.toCharArray();
        String result = "";

        for(char c : ch){
            if(c>='a' && c<='z'){
                result = result + '@';
            } else if (c>='0' && c<='9') {
                result = result + '&';
            }
            else result = result+ c;
        }
        System.out.println(result);
    }
}
