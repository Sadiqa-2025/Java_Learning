public class FactorialOfNumber
{
    public static void main(String[] args) {
        int n=5;
        int result=1;
        for(int i=1; i<=n; i++ ){
            result= result * i;

        }
        System.out.println("The factorial of the given number is " + result);
    }
}
