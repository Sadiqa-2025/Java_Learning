package StringPrograms;
/*
"Reverse string “Test@59I” but ‘@59’ should not be reversed
output : ""Itse@59T"""
 */
public class ReverseWithoutSpecialChars01 {


    static void reverse(String s){
        char[] ch = s.toCharArray();
       int left = 0;
       int right = s.length()-1;
        while (left < right){
            if(Character.isLetter(ch[right])){        //if the right most character is letter
                //swap the left most and rigth most element
                char temp = ch[right];
                ch[right] = ch[left];
                ch[left] = temp;
            }
            //updation
            right--;
            left++;

        }
        System.out.println(new String(ch));
    }

    public static void main(String[] args) {
       String s = "Test@59I";
       reverse(s);
    }

}
