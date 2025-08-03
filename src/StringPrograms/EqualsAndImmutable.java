package StringPrograms;

public class EqualsAndImmutable {
    public static void main(String[] args) {
        String s1= "Monday";
        String s2= new String("Tuesday");
        String s3 = "Monday";
        String s4 = new String("Monday");
        System.out.println(s1.equals(s4)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1==s3); //true, since both references point to same value in SCP
        System.out.println(s1==s4);// false, because both are different references, one in SCP and one in Heap
        System.out.println(s1.concat("is Hectic")); //performs concat operation
        System.out.println(s1); //Immutable since it returns the original value after the above concat operation
    }
}
