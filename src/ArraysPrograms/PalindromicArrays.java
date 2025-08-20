package ArraysPrograms;
/*
"Count the number of palindromic subarrays in an array of strings

Input: {""madam"", ""racecar"", ""level"", ""apple""}

Output: 3"
 */
public class PalindromicArrays {
    static StringBuilder reverse(String arr){
        StringBuilder revString = new StringBuilder(arr);
       return  revString.reverse();
    }

    public static void main(String[] args) {
        int count = 0;
        String[] arr = {"madam", "racecar" , "level", "apple"};

        for(int i=0; i< arr.length; i++){
            StringBuilder currentRev = reverse(arr[i]);
            StringBuilder currentWord = new StringBuilder(arr[i]);
            if(currentWord.compareTo(currentRev) == 0){
                System.out.println("Entered the for loop");
                count++;
            }
        }
        System.out.println(count);
    }
}
