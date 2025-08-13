package StringPrograms;
/*
"input: String str = ""HelloWrold"";
output = ""World"";"
 */
public class String023 {

    public static void main(String[] args) {
        String s1 = "Hell0 World";
        int count =0;
        for(int i =0; i<s1.length(); i++){
            if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
                count++;
                if(count ==2){
                   // System.out.println(s1.charAt(i));
                    System.out.println(s1.substring(i));
                    break;
                }
            }


        }

    }
}
