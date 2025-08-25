package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;

/*
"Store employee ID (Integer) and employee name (String) in a HashMap.

1. Print all key-value pairs.
2. Search for a particular employee ID.
3. Remove one entry."
 */
public class HashMap01 {
    public static void main(String[] args) {
        Map<Integer, String > emp = new HashMap<>();
        emp.put(10, "emp1");
        emp.put(11, "emp2");
        emp.put(15, "emp3");
        emp.put(7, "emp4");
        emp.put(02, "emp5");
        System.out.println(emp);
        System.out.println(emp.containsKey(15));
        emp.remove(02, "emp5");
        System.out.println(emp);

    }
}
