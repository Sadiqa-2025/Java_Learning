package Logical_Patterns;
/*    "Write a program to generate below patterns:
            1
            12
            123
            1234
            12345

    Note: No array/Collection should be used."*/

/*Logic
1- Difference between each row, one extra digit is added at the end.
2- last number is incrementing
3- every row is the sum of prev row number +(Concat) incremented value of last number
 */

public class Pattern01 {

      static void pattern(String a, int count) {

        for (int i = 1; i < 5; i++) {
            a = a + ++count;
            System.out.println(a);
        }
    }
        public static void main (String[]args){
          String a ="1";
          int count = 1;
          System.out.println(a);
          pattern(a, count);

        }


}
