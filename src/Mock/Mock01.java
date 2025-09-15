package Mock;

public class Mock01 {
    /*
    Given a string: .String s = "1200978";Modify it so that all 0’s should be moved to the end.
     */
    public static void main(String[] args) {
        String s = "1200978";
        int[] arr = new int[s.length()];
       // int i=0;
      /*  for(char ch: s.toCharArray()){
            if(Integer.parseInt(String.valueOf(ch)) > 0) {
                arr[i++] = Integer.parseInt(String.valueOf(ch));
            }
        }*/
        //Regular for loop
        int j=0;
        for(int i = 0; i<s.length(); i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i))) > 0){
                arr[j++] = Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }

     /*   for(int x: arr){
            System.out.print(x+ " ");
        }*/
        String res = "";
        for(int i = 0; i<arr.length; i++){
            res = res + arr[i];
        }
        System.out.println(res);

    }
}
