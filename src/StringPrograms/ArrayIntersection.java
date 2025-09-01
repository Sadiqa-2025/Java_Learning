package StringPrograms;
/*
"Find intersection of two character arrays and output as a string (without duplicates)

char[] arr1 = {'a', 'b', 'c', 'd'}

char[] arr2 = {'c', 'd', 'e', 'f'}

Output: ""cd"""
 */
public class ArrayIntersection {
    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c', 'd'};
        char[] arr2 = {'c', 'd', 'e', 'f'};

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
