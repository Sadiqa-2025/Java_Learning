package StringPrograms;

public class EachLetterTwice {
    public static void main(String[] args) {
        String s = "SadiqaNishat";
        String newStr = "";
        for(int i=0; i<s.length() ; i++) {
            newStr = newStr + s.charAt(i) + s.charAt(i);
        }
        System.out.println(newStr);
    }
}
