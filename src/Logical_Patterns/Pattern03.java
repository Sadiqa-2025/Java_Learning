package Logical_Patterns;


/*
 "String str="" I am good Person"";
    output : "" I ma good nosreP"";"

    */

public class Pattern03 {

    static String reverse(String s){
        String rev="";
        for(int i=s.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
      return rev;
    }
    public static void main(String[] args) {
        String s = "I am good person";
        String result = "";
        String[] words = s.split(" ");
        for(int i=0; i<words.length; i++){
            if(i%2!=0){
                result= result+" " + reverse(words[i]);
            }
            else{
            result = result+" "+ words[i];
            }
        }
        System.out.println(result);


    }
}
