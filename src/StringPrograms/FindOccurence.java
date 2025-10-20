package StringPrograms;
/*
Write a java program to find occurence of each digits in a array {1,4,5,8,1,2,1,4}.
 */

public class FindOccurence {
    public static void main(String[] args) {
        int[] array = {1,4,5,8,1,2,1,4};

        for(int i=0; i<array.length; i++){
            int count=1;
            int num = array[i];
            for(int j=0; j<array.length; j++){
                if(array[i]==array[j] && i!=j){
                    count++;
                }

            }
            System.out.println(array[i] + "---" + count);
        }
    }

}
