package StringPrograms;
/*
"Given a String // Input = aabbcccaabbb, expected OutPut1: abc
try to get unique chars without using built in methods and functions"
 */
public class String30Aug1 {
    public static void main(String[] args) {
        String input = "aabbcccaabbb";
        String output = "";
        // add first character

        for(int i=0; i<input.length(); i++){
        char ch = input.charAt(i);
            boolean found = false;
        //check the occurece in output string
            for(int j=0; j<output.length();j++){
                if(ch==output.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(found ==false){
                output = output +ch;
            }
        }
        System.out.println(output);
    }
}
