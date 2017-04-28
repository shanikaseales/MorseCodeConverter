//Shanika Seales 2/21/2017

import java.util.*;

public class c70221ssArrayO
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] total   = new int[10];
      int[] avg     = new int[10]; 
      int[] highest = new int[10];
      int[] lowest  = new int[10];
      int N1;
      int N2;
      
      for(int c = 0; c < 1; c++)
      {
         System.out.println("Enter a number");
         N1 = input.nextInt();
           
         System.out.println("Enter a second number");
         N2 = input.nextInt();
         
         total = getTotal(N1, N2);
         avg = getAverage(total);
         highest = getHighest(N1, N2);
         lowest = getLowest(N1, N2);
         
         System.out.println("Total is " + total[c]);
         System.out.println("Average is " + avg[c]);
         System.out.println("Highest is " + highest[c]);
         System.out.println("Lowest is " + lowest[c]);
      }  
   }
   
   public static int[] getTotal(int N1, int N2)
   {
      int[] total = new int[10];
      
      for(int c = 0; c < 10; c++)
      {
         total[c] = N1 + N2;
      }
      return total;
   }
   
   public static int[] getAverage(int[] total)
   {
      int[] avg = new int[10];
      
      for(int c = 0; c < 10; c++)
      {
         avg[c] = (total[c] / 2);
      }
      return avg;
   }
   
   public static int[] getHighest(int N1, int N2)
   {
      int[] highest = new int[10];
      
      for(int c = 0; c < 10; c++)
      {
         if(N1 > N2)
         {
            highest[c] = N1;
         }
         else
         {
            highest[c] = N2;
         }
      }      
      return highest;
   }
   
   public static int[] getLowest(int N1, int N2)
   {
      int[] lowest = new int[10];
      
      for(int c = 0; c < 10; c++)
      {
         if(N1 < N2)
         {
            lowest[c] = N1;
         }
         else
         {
            lowest[c] = N2;
         }
      }      
      return lowest;
   }
}