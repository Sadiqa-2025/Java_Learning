package ArraysPrograms;
/*
"Merge Two Sorted Arrays
Input: [1,3,5] and [2,4,6] → Output: [1,2,3,4,5,6]"
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a= {1,3,5};
        int[] b = {2,4,6};
        int[] c = new int[a.length + b.length];
        int i=0;
        for(int x: a){
            c[i]=x;
            i++;
        }
        int j= a.length;
        for(int x : b){
            c[j]=x;
            j++;
        }
        int min= c[0];
       for(int k=0; k<c.length ; k++){
           for(int l=k+1; l<c.length; l++) {
               if (c[k] > c[l]) {
                   int temp = c[k];
                   c[k] = c[l];
                   c[l] = temp;
               }
           }
       }
       for(int x: c){
           System.out.print(x+ " ");
       }
    }
}
