public class StaticNonStatic02 {

    int x= 12;
    static int y = 15;
    {
        System.out.println("Non static Block");
        int sum = x+y;
        System.out.println("Sum is " + sum);
    }

    static
    {
        System.out.println("Static Block");
        int Square = y*y;
        System.out.println("square is "+ Square);
    }

    static void addition(int x,int y){
        System.out.println("addition from static method" + (x+y));
    }

    int difference(){
        System.out.println("Non static method execution");
        int diff = x-y;
        return diff;
    }

    public static void main(String[] args) {
    StaticNonStatic02 obj = new StaticNonStatic02();
    addition(obj.x,y);
    System.out.println(obj.difference());

    }
}
