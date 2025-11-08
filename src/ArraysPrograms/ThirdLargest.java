package ArraysPrograms;

import java.util.*;

/*
"Find the third largest unique number in an array

int[] arr = {10,10,8,5,2,6,8}

Output: 6"
 */
public class ThirdLargest {
    public static void main(String[] args) {
        int[] array = {10,10,8,5,2,6,8};

        //Logic 1
    /*    Arrays.sort(array);// 2,5,6,8,8,10,10
        int count=2;
        int largest= array[array.length-1];  //10
        for(int i=0; i< array.length; i++){
            for(int j= array.length-1; j>=0;j--){
                if(array[j] < largest && count>0 ){    //8<10
                    int secondLargest= array[j];
                    largest = secondLargest;
                    count--;
                    break;
                }
            }
        }
        System.out.println(largest);*/

        //Logic 2
        Set<Integer> s = new TreeSet(); //declared a set
        // inserting values into set
        for(int a: array){
            s.add(a); //2,5,6,8,10;
        }
        //converting to list to access using index
       List<Integer> list = new ArrayList<>(s);
        System.out.println(list.get(list.size()-3));





    }
}
