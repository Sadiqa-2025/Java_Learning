package StringPrograms;
/*
"Reverse string “Test@59I” but ‘@59’ should not be reversed
output : ""Itse@59T"""
 */
public class ReverseWithoutSpecialChars {
    public static void main(String[] args) {
        String s = "Test@59I";
        String rev = "";
        String revsub="";
        String sub="";
        int index=0;


        //get index of first special char
        for(int i=0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i))|| Character.isSpaceChar(s.charAt(i))){
                index = i;
                break;
            }
        }
        //Seperating the special characters
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='5' || s.charAt(i)=='9' || s.charAt(i)=='@'){
             sub = s.charAt(i)+sub;
            }
            else{
            rev = rev + s.charAt(i);
            /*
                  9  = 9 + null
                  59  = 5 + 9
                 @59  = @ + 59
             */
}       }

        System.out.println(rev);


        System.out.println( rev.replace("T", sub )  +  s.charAt(0));
    }
}
/*
First character = I
sub = 9
*/
