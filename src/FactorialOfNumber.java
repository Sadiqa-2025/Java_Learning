public class FactorialOfNumber
{
    /*
    5 Fact = 5*4*3*2*1= 120
    3 Fact = 3*2*1 = 6
    Logic:
    1- Initially i will start from 1, multiply by next number
    2- I will store the result
    3- I will point 1 and 2 till the final number.
     */
    public static void main(String[] args) {
        int n=5;
        int result=1;
        for(int i=1; i<=n; i++ ){
            result= result * i;

        }
        System.out.println("The factorial of the given number is " + result);
    }
}
