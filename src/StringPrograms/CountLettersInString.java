package StringPrograms;
/*
"Write a code to count letters in the string

I/p : pratikshakale

O/p: p-1, r-1, a-3, t-1, i-1, k-2, s-1, h-1, l-2, e-1"
 */
public class CountLettersInString {
    public static void main(String[] args) {
        String s = "pratikshakale";
        char[] ch = s.toCharArray();
        for(char c : ch){
            int count=0;
            for(int i=0; i<s.length(); i++){
                if(c==s.charAt(i)){
                    count++;
                }
            }
            System.out.print(c + "-" + count+ ", ");
        }
    }
}
