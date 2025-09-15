package StringPrograms;
/*
"Write a java program with the below inputs, where arrays inputs are considered as index of the string.
String = ""java programming language""
int[] arr = {1,5, 17} // 0th,5th,17th index should be captial letter
and output should be in the form of below:
Output = Java Programming Language"
 */
public class IndexCapital {
    public static void main(String[] args) {
        String input = "java programming language";
        char[] ch = input.toCharArray();
        int[] arr = {0, 5, 17};
        String output = "";
        //traverse through string
        for (int x : arr) {
            ch[x]= Character.toUpperCase(ch[x]);
        }

        for(char ch1 : ch){
           output = output + ch1;
        }
        System.out.println(output);
    }
}
