public class PalindromeUsingMethod {

    static int palindrome(int num) {
        int OriginalNumber = num;
        int rev = 0;
        int digit = 0;
        while (num > 0) {
            digit = num % 10;  //take the last digit on right
            rev = rev * 10 + digit; // add last digit to left side
            num = num / 10; // update the number
        }
        return rev;

    }

    public static void main(String[] args) {
        int number = 12321;
    if(palindrome(number)== number){
        System.out.println("The number is palindrome");
    }
    else {
        System.out.println("Not palindrome");
    }
    }
}
