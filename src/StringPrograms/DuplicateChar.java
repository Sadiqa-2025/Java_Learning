package StringPrograms;

import java.util.HashSet;

/*
"Java program to find duplicate characters in a string
String s = ""Traffic"""
 */
public class DuplicateChar {
    public static void main(String[] args) {
        String s= "Traffic";
        HashSet<Character> duplicate = new HashSet<>();

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
              for(int j=0; j<s.length();j++){
                  if(ch == s.charAt(j) && i!=j){
                      duplicate.add(s.charAt(j));
                  }
              }
          }
        System.out.println(duplicate);
        }
}
