package StringPrograms;

import java.util.Arrays;

/*
"Write a program to reverse only the smallest and Largest words in a given string.
String str = ""Java is Beautiful programming""
output = ""Java si Beautiful gnimmargorp"""
 */
public class ReverseSmallest {
   static int smallest;
   static int largest;
  static  StringBuilder result = new StringBuilder();

    //method to perform reverse
    static StringBuilder reverse(String s){
        StringBuilder s1 = new StringBuilder(s);
       return s1.reverse();
    }

    static void sort1(int[] array){
        Arrays.sort(array);
         smallest  =array[0];   // smallest value of array
         largest = array[array.length-1];
        System.out.println(smallest);
        System.out.println(largest);// largest value of array
    }

    static void createNewArray(String[] words, int[] array){
        int i=0;
    for(String x : words){
       array[i++]= x.length();
    }
    sort1(array);
    }

    static void finalReverse(String[] words, int smallest, int largest){
        for(String x : words){
            if(x.length()==smallest || x.length()==largest){
               result.append(reverse(x)+ " ");

            }
            else{
                result.append(x+ " ");
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String s = "Java is Beautiful programming";
        String[] words = s.split(" ");
        int[] array = new int[words.length];
        createNewArray(words, array);
        finalReverse(words, smallest , largest);

    }
}
