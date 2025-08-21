package ArraysPrograms;
/*
"Find the common characters in all strings of a string array

Input: {""bella"",""label"",""roller""}

Output: ""el"""
 */
public class CommonCharsInArray {
    public static void main(String[] args) {
        String[] arr = {"bella", "label", "roller"};
        String firstWord = arr[0];

        for(int i=0; i< firstWord.length(); i++){
            // get letters from the first word
            char ch = firstWord.charAt(i);
            boolean isUnique = true;
            // iterate loop from second word onwards to compare the occurence

            for(int j=1; j< arr.length; j++){

                if(arr[j].indexOf(ch)== -1){
                   isUnique = false;
                }
                else{
                    arr[j]= arr[j].replaceFirst(String.valueOf(ch), " ");
                }
            }
                     if(isUnique){
                           System.out.print(ch + " ");
                 }
        }

    }
}
