package ArraysPrograms;
/*
"Rotate an array of strings: Move the first k elements to the end

Input: {""one"",""two"",""three"",""four"",""five""}, k=2

Output: {""three"",""four"",""five"",""one"",""two""}"
if k=2
output = input string k index element till end + input elements first 0 to k-1 elements
 */

public class RotateAnArray {
    public static void main(String[] args) {
        String[] input = {"one", "two", "three", "four", "five"};
        String[] output = new String[input.length];
        int k=2;
        int x= 0;
        int y= k+1;

        for(int i = 0; i<input.length ; i++){
            if(i >= k){
                output[x] = input[i];
                x++;
            }
            else {
                output[y] = input[i];
                k++;
            }
        }
        for(String z: output){
            System.out.print(z+ " ");
        }
    }
}
