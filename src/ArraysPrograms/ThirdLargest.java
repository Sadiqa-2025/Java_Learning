package ArraysPrograms;

import java.util.TreeSet;

/*
"Find the third largest unique number in an array

int[] arr = {10,10,8,5,2,6,8}

Output: 6"
 */
public class ThirdLargest {
    public static void main(String[] args) {
        int[] array = {10,10,8,5,2,6,8};
        int first= array[0];
        int sec = array[1];

        for(int i=0; i<array.length; i++){
            if(array[i]> first){
             sec = first;
             first = array[i];
            }
        }
        System.out.println(first);
        System.out.println(sec);

    }
}
