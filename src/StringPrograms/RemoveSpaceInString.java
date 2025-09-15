package StringPrograms;

public class RemoveSpaceInString {
    public static void main(String[] args) {
        String s =  "Java is a very good programming language";
        String newStr = "";
    /*    for(int i=0; i<s.length(); i++) {
          if(s.charAt(i)!=' '){
          newStr = newStr + s.charAt(i);
          }*/
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                continue;
            }
          newStr =newStr+ s.charAt(i);

      }
        System.out.println(newStr);
    }
}
