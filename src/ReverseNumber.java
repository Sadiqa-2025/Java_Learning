public class ReverseNumber {
    public static void main(String[] args) {
        //declare the number
        int originalNum = 123454321;
        int n = originalNum;
        int reverseNum = 0;
        //int lastDigit = 0;
        while(n > 0) {
            int  lastDigit = n % 10; //gives the last digit
            reverseNum = reverseNum*10 + lastDigit;
            n = n/10;
        }
        System.out.println(reverseNum);
        if(originalNum == reverseNum){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }

    }
}
