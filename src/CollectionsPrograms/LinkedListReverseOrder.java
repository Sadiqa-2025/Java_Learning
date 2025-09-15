package CollectionsPrograms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
"Create a LinkedList of integers and:
1. Add elements
2. Remove the first and last element
3. Print the list in reverse order"
 */
public class LinkedListReverseOrder {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(10);
        num.add(12);
        num.add(15);
        num.add(17);
        num.add(20);
        num.add(8);
        System.out.println(num);
        num.removeFirst();
        num.removeLast();
        System.out.println(num);
        Collections.reverse(num);
        System.out.println(num);
        Collections.reverseOrder();
      /*  for(int i=num.size()-1; i>=0; i--){
            System.out.println(num.get(i));
        }*/
    }
}
