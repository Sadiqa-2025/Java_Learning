package StringPrograms;
/*
Java program to gives two Output: “Subburaj”, “123” for the Input String Str = “Subbu123raj”
 */
public class SubbuRaj {
    public static void main(String[] args) {
        String s = "Subbu123raj";
        char[] ch = s.toCharArray();
        String alpha = "";
        String num ="";

        for(int i=0; i<s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                alpha = alpha + s.charAt(i);
            }
        }
        System.out.println(alpha);

        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                num = num + s.charAt(i);
            }
        }
        System.out.println(num);
    }
}
