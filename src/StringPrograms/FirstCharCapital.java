package StringPrograms;
/*
"Given a sentence, capitalize the first letter of every word whose length is odd

Input: ""this is a simple test""

Output: ""This is a Simple test"""
 */
public class FirstCharCapital {
    public static void main(String[] args) {
        String input = "this is a simple test";
        //split string into array of words
        String[] words = input.split(" ");
        String output = "";

        //traverse through each word and capitalise first character
        for(int i=0; i< words.length ; i++){
        String word = words[i];
        output = output + word.substring(0,1).toUpperCase() + word.substring(1)+ " ";
        }

        System.out.println(output);
    }
}
