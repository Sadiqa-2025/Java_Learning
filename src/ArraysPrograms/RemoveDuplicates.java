package ArraysPrograms;
/*
"Write a java code to filter out dupicate intergers.
 int [] a ={1,2,2,3,3,34,6,7,8}"
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,34,6,7,8};
       /*
       forloop1; i=0(1)
       forLoop2;
       f1: i=1(count=1), value=2
       f2: j=2(count=1) , value=2
        */
        for(int i=0; i<arr.length; i++){
            int count=1;
            int x= 0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){ // This is duplicate checking logic
                    count++;
                    x=j;
                    break;
                }

            }
            if(count>1){
                System.out.print(arr[x] + " ");
            }
        }


    }
}
