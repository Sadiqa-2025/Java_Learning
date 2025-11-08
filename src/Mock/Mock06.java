package Mock;

public class Mock06 {
    static int increment(int x) {
        return ++x;
    }

    public static void main(String[] args) {
        int a = 5;
        a = increment(a++) + increment(++a);
       // a = 6 + 8
        System.out.println(a);



        int x = 1;
        int y = x++ + x++ + ++x + ++x + x;
        //      1    + 2  + 4  +  5  + 5= 17
        // x=2,3,4, 5
        // y= 17
        System.out.println("x=" + x + ", y=" + y);


    }
}
