public class SwapWithoutVariable {
    public static void main(String[] args) {
        //declare two variables
        int a = 3;
        int b = 2;
        /*
        Logic to swap
        a=3, b=2
        a+b=5
        a=5-a gives a=2
        b=5-b gives b=3
         */
        int c = a+b;
        a = c-a;
        b = c-b;
        System.out.println("a value is " + a);
        System.out.println("b value is " + b);
    }
}
