package CollectionsPrograms;

import java.util.HashMap;

/*
"Take a string input and count the occurrence of each word using a HashMap.

Input: ""Java is fun and Java is powerful""
Output: {Java=2, is=2, fun=1, and=1, powerful=1}"
 */
public class HashMap02 {
    public static void main(String[] args) {
        String str = "Java is fun and Java is powerful";
        String[] words = str.split(" ");
        HashMap<String, Integer> h = new HashMap();
       for(String x: words){
           h.put(x, h.getOrDefault(x, 0)+1);
       }
        System.out.println(h);
    }
}
