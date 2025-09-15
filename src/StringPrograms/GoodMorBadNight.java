package StringPrograms;
/*
"String “GoodMorningGoodAfternoonGoodNight”
output = “GoodMorningGoodAfternoonBadNight”
Replace 3rd good with bad."
 */
public class GoodMorBadNight {
    public static void main(String[] args) {
        StringBuilder in =new StringBuilder( "GoodMorningGoodAfternoonGoodNight");

        String g = "Good";
        int count =0;
        System.out.println(in.substring(0,4));
        System.out.println(in.length());
        int index = in.lastIndexOf("Good");
        System.out.println(index);
        System.out.println( in.replace(index, index+ g.length(), "Bad"));


    }
}
