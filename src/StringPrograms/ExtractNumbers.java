package StringPrograms;
/*
"Given a string representing numbers separated by special characters, extract and sum the numbers

Input: ""2#a$4@5""

Output: 11"
 */
public class ExtractNumbers {

    public static void main(String[] args) {
        String s = "2#a$4@5";
        char[] c = s.toCharArray();
        int sum=0;
        for(char ch : c){
            if(Character.isDigit(ch)){
               sum = sum + ch;
            }
        }
        System.out.println(sum);
    }
}
