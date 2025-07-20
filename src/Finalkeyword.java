public class Finalkeyword {

    static void finalMethod(final int x){
        //System.out.println(x++); //final variable can not be reassigned
        System.out.println("Can not reassign the final variable");
    }
    public static void main(String[] args) {
        final int a =10;
        int b= 20;
        System.out.println(a);
        //a = 15;  //final variable can not be reassigned
        finalMethod(b);
        final Finalkeyword obj = new Finalkeyword();
        System.out.println(obj);
        //obj = new Finalkeyword();  // can not reinitialise final reference variable
        System.out.println(obj);

    }
}
