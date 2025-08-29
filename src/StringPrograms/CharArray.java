package StringPrograms;
/*
"Check if every character in a string appears in an array of allowed characters

String: ""abcxyz""

char[] allowed = {'a', 'b', 'c', 'x', 'y', 'z'}

Output: ""true"""
 */
public class CharArray {
    public static void main(String[] args) {
        String input = "abcvxyz";
        char[] allowed = {'a', 'b', 'c', 'x', 'y', 'z'};
        boolean present = false;

        //traverse through the input String
        label:
        for(int i=0; i<input.length(); i++){

            char ch = input.charAt(i);

            //traverse through the char array
            for(int j=0; j<allowed.length; j++) {
                if (ch == allowed[j]) {
                    present = true;
                }

                else{
                    present = false;
                    break label;
                }
            }
        }
        if(present){
            System.out.println("All present");
        }
        else System.out.println("Not present");
    }
}
