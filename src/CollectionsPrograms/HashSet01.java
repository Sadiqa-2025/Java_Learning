package CollectionsPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
"Write a program that reads 10 numbers from the user and stores them in a HashSet.
1. Print all unique numbers.
2. Check if a particular number exists.
3. print them in ascending order."
 */
public class HashSet01 {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        num.add(1);
        num.add(5);
        num.add(4);
        num.add(3);
        num.add(2);
        num.add(2);
        num.add(3);
        num.add(2);
        System.out.println(num);
        System.out.println(num.contains(2));
        TreeSet sorted = new TreeSet(num);
        System.out.println(sorted);
    }
}
