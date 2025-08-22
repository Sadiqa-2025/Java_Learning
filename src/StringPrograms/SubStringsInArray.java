package StringPrograms;
/*
"Count the number of elements in an array that are present as substrings in a given string

Input: String: ""welcome to programming practice""

String[] arr = {""welcome"", ""practice"", ""to"", ""java""}

Output: 3"
 */
public class SubStringsInArray {

    static int countElement(String[] words, String[] arr){
        int count =0;
        //compare every element from words to all the elements of arr.
        for(int i=0; i< words.length; i++){
            String currentWord = words[i];
            for(int j=0; j< arr.length; j++){
                if(currentWord.equals(arr[j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = "welcome to programming practice";
        String[] arr = {"welcome", "practice", "to", "java"};
        String[] words = input.split(" ");
        System.out.println( countElement(words,arr));
    }
}
