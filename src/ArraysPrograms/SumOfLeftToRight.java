package ArraysPrograms;
/*
"given array = {1,1,7,2,0};
    output should be 7 because sum of all left from 7 is same as sum of all elements to right"
 */
public class SumOfLeftToRight {
    public static void main(String[] args) {
        int[] arr ={1,1,7,2,0};
        int sumLeft=0;
        int sumRight = 0;
        int res=0;
        for(int i=0; i<arr.length; i++){
            for(int j=arr.length-1; j>=0; j--){
                sumLeft = sumLeft + arr[i];
                sumRight = sumRight + arr[j];
                if(sumRight == sumLeft){
                   res = sumLeft;
                }
            }
        }
        System.out.println(res);
    }
}
