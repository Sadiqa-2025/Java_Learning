public class FibonacciSeries {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        for(int i=0; i<=100; i++){
            int num3= num1 + num2;
            num1= num2;
            num2 = num3;
            if(num3 >= 100)
            break;
            System.out.println(num3);
        }
    }
}
