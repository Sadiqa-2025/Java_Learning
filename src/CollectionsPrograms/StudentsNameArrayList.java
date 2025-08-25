package CollectionsPrograms;

import java.util.ArrayList;
import java.util.List;
/*
Write a program to store 10 student names in an ArrayList and display them.
 */
public class StudentsNameArrayList {
    public static void main(String[] args) {
        List<String> st = new ArrayList<>();
        st.add("Student1");
        st.add("student2");
        st.add("student3");
        st.add("student4");
        st.add("student5");
       // System.out.println(st);
        for(String x : st){
            System.out.println(x);
        }
    }
}
