package CollectionsPrograms;

import java.util.HashSet;

/*
"Remove duplicates from an Array
int[] array = {5, 2, 9, 1, 6, 2, 5};"
 */
public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] array = {5,2,9,1,6,2,5};
        HashSet<Integer> h = new HashSet<>();
        for(int x: array){
            h.add(x);
        }
        System.out.println(h);
    }
}
