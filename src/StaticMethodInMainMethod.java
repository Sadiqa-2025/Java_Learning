public class StaticMethodInMainMethod {

    static int sum(int a, int b){
        int res = 0;
        res = a+b;
        return res;
    }
    public static void main(String[] args) {
         int x = 10;
         int y = 15;
        System.out.println(sum(x,y)); //method can be accessed directly
        StaticMethodInMainMethod obj = new StaticMethodInMainMethod();
        System.out.println(obj.sum(x,y)); // can be accessed using object creation
        System.out.println(StaticMethodInMainMethod.sum(x, y)); // can be accessed using class name

    }
}
