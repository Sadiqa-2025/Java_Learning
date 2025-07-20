public class NonStaticMethodinMainMethod {
    int num =12;
    void evenOrOdd(int number){
        if(number%2==0){
            System.out.println("Even number");
        }
        else System.out.println("Odd number");
    }

    public static void main(String[] args) {
        NonStaticMethodinMainMethod obj = new NonStaticMethodinMainMethod();
        obj.evenOrOdd(obj.num);
    }
}
