package Mock;
import Mock.Mock03;

public class Mock02 {
    /*
    "Write a program for the Input:

Int[] a = {1,2,3};

Int[] b = {4,5,6};

Output:

{1+6,2+5,3+4}"
     */
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};

        for(int i=0; i<a.length ;){
            for(int j=b.length-1; j>=0;){
                System.out.println(a[i++]+"+"+b[j--]);
            }
        }
        Mock02 obj = new Mock02();


    }
}
