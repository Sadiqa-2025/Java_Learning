package StringPrograms;

import java.util.Scanner;

/*
"String s = ""If you create a new account instead of logging in you will have to select your name from
the student list""
Based on the user input you need to reverse the words- for ex
1- if the value is 2, then you have to check the words which has length =2, This shoudl be reversed.
2- if the given value is odd with matches with the length, then these words should be converted
 to upper case letters
conclusion- with this logic the above string should be printed."
 */
public class ReverseStringWithUserInput {
    static StringBuilder result = new StringBuilder();

    //Method to reverse a string
    static StringBuilder reverse(String x){
       StringBuilder s = new StringBuilder(x);
       return  s.reverse();
    }

    static void checkForIndexValues(String[] words, int index){
        for(String x: words){
            if (index%2!=0 && index==x.length()) {
                result.append(x.toUpperCase()+ " ");
            } else if (index%2==0 && index==x.length()) {
                    result.append(reverse(x)+ " ");
            }
            else result.append(x+ " ");
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str =  "If you create a new account instead of logging in you will have to select your name from" ;
        Scanner ind = new Scanner(System.in);
        System.out.println("Enter the value of Index");
        int index = ind.nextInt();
        // seperate String as array of words
        String[] words = str.split(" ");
        checkForIndexValues(words, index);

    }
}
