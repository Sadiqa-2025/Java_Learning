package ArraysPrograms;

import java.util.Arrays;

/*
Find the second highest element in an array
 */
public class SecondHighestElement {

    public static void main(String[] args) {
        int[] array = {1,5,4,2,3,0,7,0,0,4,77};
        Arrays.sort(array);
        System.out.println("Second highest element is");
        System.out.println(array[array.length-2]);

        //logic to sort array without sort method
        int small = array[0];
        for(int i=0; i< array.length; i++){
            for(int j=i+1; j<array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        //Print the elements of array
        for(int x: array){
            System.out.print(x+ " ");
        }
        System.out.println("Second highest is");
        System.out.println(array[1]);
    }

}
