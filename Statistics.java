import java.util.*;

public class Statistics
{
   public static void main(String[]arg)
   {
      int[][] num = new int [3][3];
      int[] count = new int[56];
      double sum = 0, avg = 0;
      
      num = numrand(num);
      count = printnum(num, count);
      sum = sumnum(num, sum);
      avg = averagenum(num, sum, avg);
      printcount(num, count);
      printupsidedown(num);
      System.out.println();
      System.out.println("Total sum is " + sum);
      System.out.println("Total average is " + avg);  
   }
   
   public static int[][]numrand(int[][]n)//good
   {
      Random rand = new Random();

      for(int row = 0; row < n.length; row++)
      {
         for(int col = 0; col < n[row].length; col++)
         {
            n[row][col] = rand.nextInt((55-40)+1)+40;    
         }
      }
      return n;
   }
   
   public static int[]printnum(int[][]n, int[]c)//good
   {          
      for(int row = 0; row < n.length; row++)
      {
         for(int col = 0; col < n[row].length; col++)
         {
            System.out.print(n[row][col]+ "     ");
            c[n[row][col]]++;
          }
          System.out.println();
       }
       return c;   
    } 
   
   public static double sumnum(int[][]n, double s)//good
   {  
      for(int row = 0; row < n.length; row++)
      {
         for(int col = 0; col < n[row].length; col++)
         {
            s += n[row][col];
         }
      }
      return s;
   }
   
   public static double averagenum(int[][]n, double s, double a)//good
   {
      for(int row = 0; row < n.length; row++)
      {
         for(int col = 0; col < n[row].length; col++)
         {
            a = s/n.length;
         }
      }
      return a;
   }
   
   public static void printcount(int[][]n, int[]c)//good
   {
      System.out.println();
      boolean[] tf = new boolean[56];
      for(int row = 0; row < n.length; row++)
      {
         for(int col = 0; col < n[row].length; col++)
         {
         	if(tf[n[row][col]] == false)
         	{
            	System.out.println(n[row][col] +" occurs " +  c[n[row][col]] + " times");
            	tf[n[row][col]] = true;
         	}
         }
      }
      System.out.println();
   }
   
   public static void printupsidedown(int[][]n)//good
   {
      for(int row = 2; row >=0; row--)
      {
         for(int col = 0; col < 3; col++)
         {
            System.out.print(n[row][col]+ "     ");
         }
         System.out.println();
      }
   }
}