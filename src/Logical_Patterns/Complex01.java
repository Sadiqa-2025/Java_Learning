package Logical_Patterns;
/*
"Write a program to get output like below:
user input=3
03 06 09
18 15 12
21 24 27

user input=4
04 08 12 16
32 28 24 20
36 40 44 48
64 60 56 52

Note: No array or Collection must be used"
Observations-
1- Print number's multiplication table, with rows and columns=number
2- For every even row , print the result from right to left
3- stop printing for rows and columns=number

 */
public class Complex01 {
    public static void main(String[] args) {
    int n=4;
    int count =1;
  for(int i =1; i<=n; i++){
      if(i%2==0) //even row
      {
          for(int j=1; j<=n; j++){
              System.out.print( n*count--+ " ");
          }
          count= count+n+1;
      }
      else if(i%2!=0)  //odd row
      {
          for(int j=1; j<=n; j++){
              System.out.print( n*count+++ " ");
          }
          count = count +n-1;
      }
      System.out.println();
  }
    }

}
