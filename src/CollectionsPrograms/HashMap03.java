package CollectionsPrograms;

import java.util.HashMap;

/*
"Take a string and count frequency of each character using HashMap<Character, Integer>

Input: ""Java is fun and Java is powerful""
Output:
J -> 2
a -> 4
v -> 2 and so on"
 */
public class HashMap03 {
    public static void main(String[] args) {
        String str = "Java is fun and Java is powerful";
        HashMap<Character, Integer> h = new HashMap();

        for(char x : str.toCharArray()){
         h.put(x, h.getOrDefault(x, 0)+1);
        }
        System.out.println(h);
    }
}
