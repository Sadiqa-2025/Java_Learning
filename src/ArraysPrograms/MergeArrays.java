package ArraysPrograms;
/*
"Merge two arrays of integers and print the merged array as a single comma-separated string

int[] a = {1,2,3}, int[] b = {4,5,6}

Output: ""1,2,3,4,5,6"""
 */
public class MergeArrays {
    public static void main(String[] args) {
        int[] a= {1,2,3};
        int[] b={4,5,6};
        String merged= "";

        for(int x: a){
            System.out.print(merged + x+ ",");
        }

        for(int y: b){
            System.out.print(merged + y + ",");
        }
    }
}
