package StringPrograms;
/*
"Replace each vowel in a string with the corresponding element in an array
String: ""automation""
char[] arr = {'1','2','3','4','5'}
Output: 12t3m4t5on"
 */
public class ReplaceVowels {
    public static void main(String[] args) {
        String a = "automation";
        char[] vow = {'1', '2', '3', '4', '5'};
        String res = "";
        int j=0;

        //traverse through the string
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='a' ||a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' ){
                res = res + vow[j];
                j++;
            }
            else{
                res = res + a.charAt(i);
            }
        }
        System.out.println(res);
    }
}
