package CollectionsPrograms;

import java.util.ArrayList;
import java.util.HashSet;

/*
"Remove duplicates from an ArrayList
5,2,9,1,6,2,9"
 */
public class RemDuplicateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(9);
        arr.add(1);
        arr.add(6);
        arr.add(2);
        arr.add(9);
        HashSet<Integer> h = new HashSet<>(arr);
        System.out.println(h);

    }
}
