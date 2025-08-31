package ArraysPrograms;
/*
"Find the Missing Number in an Array
int[] array={1,2,4,5,6};"
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,8};
        int x= array[0];
/*
i=0, x=0
i=1, x=0++=1
i=2  x=1++=2
 */
        for(int i=0; i< array.length-1; i++){
            if(++x != array[i+1]){
                System.out.println(x++);
            }
        }
    }
}
