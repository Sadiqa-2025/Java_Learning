package StringPrograms;
/*
"Given a string of brackets, create a function to validate if the parentheses are balanced.
Examples:

Input: ""({()})"" ➡️ Output: True
({})
()

Input: ""({)]"" ➡️ Output: False"
 */

public class BalancedParanthesis {


    public static void main(String[] args) {
        String input = "({()})";
        //String input = "({)]";
        int count=input.length();
        while(count>=1){
          input = input.replace("()", "").replace("[]","").replace("{}", "");
          count--;
        }
        System.out.println(input);
        if(input.isEmpty()){
            System.out.println("It is balanced");
        }
        else System.out.println("Not balanced");
    }
}
