package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
"Store names in an ArrayList and sort them using Collections.sort().
Then, sort them in reverse order."
 */
public class SortReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList();
        arr.add("abc");
        arr.add("zebra");
        arr.add("hello");
        arr.add("mom");
        arr.add("jelly");
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
