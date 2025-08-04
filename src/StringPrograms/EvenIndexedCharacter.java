package StringPrograms;

public class EvenIndexedCharacter {
    public static void main(String[] args) {
        String s = "even indexed character";
        System.out.println("The characters at even index are");
        for(int i=1; i< s.length(); i++) {
            if(i%2==0 && s.charAt(i)!=' '){
                System.out.print(s.charAt(i) + " ");
            }
        }
    }
}
