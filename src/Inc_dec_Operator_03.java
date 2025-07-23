public class Inc_dec_Operator_03 {
    public static void main(String[] args) {
        int x = 1;
        int y = 10;
        int z = 100;
  //      x=-2   y=11   z=98
        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
//                0 + 10  - 100 - 98  + 12  - (-1) + 12 -  (-2)
        System.out.println(y);
        // int j = y++;
       //         10     11     10
        //System.out.println("x="+x);
        //System.out.println("y="+y);
       /* System.out.println("z="+z);
        System.out.println("i="+i);*/
    }
}
