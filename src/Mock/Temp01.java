package Mock;
/*
program to reverse the given number input=14578 , output=87541 using logic inside method
 */
public class Temp01 {

    static int reverse_num(int num){
        int rev=0;                 // create a default variable
        while(num>0){
            int digit = num%10;     //get the last digit
            rev = rev *10 + digit;   //multiply by 10 to remove decimal and add to default
            num = num/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 14578;         //initialise the num
        System.out.println(reverse_num(num));
    }
}
