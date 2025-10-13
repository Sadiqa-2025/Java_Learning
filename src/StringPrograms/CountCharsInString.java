package StringPrograms;

public class CountCharsInString {

    public static int countChars(String s){
        int count=0;
        for(char x: s.toCharArray()){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello String";
        System.out.println(countChars(s));
    }
}
