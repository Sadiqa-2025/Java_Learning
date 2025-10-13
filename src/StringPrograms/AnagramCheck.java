package StringPrograms;
/*
"Program to check 2 strings are anagram or not
 String str1 = ""Silent"";
 String str2 = ""Listen"";"
 */
public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listen";
        boolean allpresent  = true;
        if (str1.length() != str2.length()) {
            allpresent = false;
            System.out.println("NOt Anagram");
        }

            //traverse through first string
            for (int i = 0; i < str1.length(); i++) {
               // boolean present = false;
                char ch = str1.toLowerCase().charAt(i);
                for (int j = 0; j < str2.length(); j++) {
                      if(str2.toLowerCase().indexOf(ch)>=0){
                    //      present = true;
                      }
                      else{
                          allpresent = false;
                      }

                }

            }
        if(allpresent){
            System.out.println("It is Anagram");
        }
        else System.out.println("Not anagram");

    }
}
