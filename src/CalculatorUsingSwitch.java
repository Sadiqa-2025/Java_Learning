public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        int a= 5;
        int b= 10;
        int result = 0;
        char addition = '*';


        switch(addition)
        {
            case '+' :
                System.out.println("addition " + (a+b));
                break;
            case '-' :
                System.out.println("subtraction "+ (a-b));
                break;
            default:
                System.out.println("Default value- no case matched");
        }
    }
}
