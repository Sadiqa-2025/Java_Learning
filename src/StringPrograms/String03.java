package StringPrograms;

/*
Java program to gives two Output: “abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”

 */
public class String03 {
    public static void main(String[] args) {
        String s = "aBACbcEDed";
        String low = "";
        String up="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                low = low + s.charAt(i);
            }
            else{
                up = up + s.charAt(i);
            }
        }
        System.out.println(low);
        System.out.println(up);
    }
}
