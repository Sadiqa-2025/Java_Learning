public class StaticVariablesUsedInMain {
    static int x=10;
    static String y = "Hello";
    public static void main(String[] args) {
        System.out.println(x); //Can be accessed directly
        System.out.println(y);
        System.out.println(StaticVariablesUsedInMain.x);
        System.out.println(StaticVariablesUsedInMain.y);  //Can be accessed using class name
        StaticVariablesUsedInMain obj = new StaticVariablesUsedInMain();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}
