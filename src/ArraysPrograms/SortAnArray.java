package ArraysPrograms;
/*
Sort an array = {4,8,33,6,9,42,121,6,7}
 */
public class SortAnArray {
    static void ascending(int[] array){
        for(int j=0; j<array.length-1; j++){
            for(int i=0; i<array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    //swap the two consecutive numbers in array
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }}
        for(int x: array){
            System.out.print(x + " ");
        }
    }

    static void descending(int[] array){
        for(int j=0; j<array.length-1; j++){
            for(int i=0; i<array.length-1; i++) {
                if (array[i] < array[i + 1]) {
                    //swap the two consecutive numbers in array
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }}
        for(int x: array){
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        int array[] = {4,8,33,6,9,42,121,6,7};
        System.out.println("ascending order");
        ascending(array);
        System.out.println();
        System.out.println("descending order");
        descending(array);
    }
}
