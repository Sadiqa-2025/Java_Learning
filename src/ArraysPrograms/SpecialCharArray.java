package ArraysPrograms;
/*
"Array consists of integers and special
characters,sum only integers
String[] array = {""5"", ""2"", ""9"", ""a"", ""1"", ""6"", ""#"", ""3""};
output: 26"
 */
public class SpecialCharArray {
    public static void main(String[] args) {
        String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
        int[] arr = new int[array.length];
        int i = 0;
        int sum = 0;
        for(String x : array){
           try{
               arr[i] = Integer.parseInt(x);
               i++;
           } catch(Exception e){
               System.out.println("Special characters can not be converted to integer");
           }
        }

        for(int x: arr){
            System.out.print(x+ " ");
        }

        //find sum of elements of the new array
        for(int x: arr){
            sum = sum + x;
        }
        System.out.println("Sum of the integers is "+ sum);
    }
}
