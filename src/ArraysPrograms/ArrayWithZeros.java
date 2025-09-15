package ArraysPrograms;
/*
"Write a java program to move all zero at the end of array
{0,0,1,2,0,8,0,7,5,6,0,3}"
 */
public class ArrayWithZeros {

    public static void main(String[] args) {
        //declaration and initialization
        int[] a = {0, 0, 1, 2, 0, 8, 0, 7, 5, 6,0, 0, 3}; //1 2 0 0 8 7 0 0 5 6 0 0 3
        int count = 0;
        int[] a1 = new int[a.length];

        // Count number of Zeros in array

        for (int x : a) {
            if (x == 0) {
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0)
                a1[count++] = a[i];

        }


        //print array a1
        for (int x : a1) {
            System.out.print(x + " ");
        }


    }
}




