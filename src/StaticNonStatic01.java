public class StaticNonStatic01 {
    static int a= 10;
    int b =20;
    static void addition(int x, int y){
        int sum = x+y;
        System.out.println(sum);
    }

    void subtraction(int x, int y){
        int difference = x-y;
        System.out.println(difference);
    }

    public static void main(String[] args) {
    //addition(a,b); // can not access NON members in static methods directly
        //Hence create an object
        StaticNonStatic01 obj = new StaticNonStatic01();
        addition(a, obj.b);
        //subtraction(a, b); // can not access NON members in static methods directly
        obj.subtraction(a, obj.b);
    }
}
