public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        int num = 234; // initialise the number
        //Logic to find sum of digits
        int sum= 0;
        while(num > 0){
          int digit = num%10; // get the last digit
            sum = sum + digit; // add it to sum
            num = num/10; // remove last digit
        }
        System.out.println(sum);

    }
}
