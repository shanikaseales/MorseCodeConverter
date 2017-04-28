//Shanika Seales 02/03/2017

import java.util.*;

public class c70203ss2DArrayO
{
   public static void main (String [] arg)
  {
      Random rand = new Random();
      
      int[][] num     = new int[4][5];
      int[] rowtotal  = new int[10];
      int[] coltotal  = new int[10];
      int[] highest   = new int[10];
      int[] lowest    = new int[10];
      int total = 0, c = 0, s = 0, r = 0, t = 0;
      double avg;        
      
      thearray(num);
      total = getTotal(num);
      avg = getAverage(total, num);
      rowtotal = getRowTotal(num);
      coltotal = getColTotal(num);
      highest  = getHighestInRow(num);
      lowest   = getLowestInRow(num);
            
      System.out.println("Total is " + total);
      System.out.println();
      System.out.println("Average is " + avg);
      System.out.println();        
      
      for(int col = 0; col<4; col++)
      {
         System.out.println("Total in Row " + c + " is " + rowtotal[col]);
      c++;
      }
      
      System.out.println();
      for(int row = 0; row<5; row++)
      {
         System.out.println("Total in Column " + s + " is " + coltotal[row]);
      s++;
      }
      System.out.println();
     
      for(int col = 0; col<4; col++)
      {
         System.out.println("Highest in Row " + r + " is " + highest[col]);
         System.out.println("Lowest in Row " + t + " is " + lowest[col]);
         System.out.println();
      r++;
      t++;
      }    
   }
   
   public static void thearray(int [][] num) //good
   {
      Random rand = new Random();
            
      for(int row = 0; row<4; row++)
      {
        for(int col = 0; col<5; col++)
        {
            num[row][col] = rand.nextInt(101) ;
            System.out.print(num[row][col]+" ");
        }
        System.out.println();
      }
   }
   
   public static int getTotal(int[][] num) //good
   {
      int total = 0;
      
      for(int row = 0; row<4; row++)
      {
         for(int col = 0; col<5; col++)
         {
            total+=num[row][col];
         }
      }
      System.out.println();
      return total;
   }
   
   public static double getAverage(int total, int[][] num)
   {
      int avg = 0;
      
      for(int row = 0; row < num.length; row++)
      {
         avg = total / 20;
      }
      return avg;
   }
   
   public static int[] getRowTotal(int[][] num)
   {
      int[] rowtotal = new int[10];
      
      for(int row = 0; row < num.length; row++)
      {
         for(int col = 0; col < num[row].length; col++)
         {
            rowtotal[row]+=num[row][col];
         }
      }
      return rowtotal;
   }
   
   public static int[] getColTotal(int[][] num)
   {
      int[] coltotal = new int[10];
      
      for(int row = 0; row < num.length; row++)
      {
         for(int col = 0; col < num[row].length; col++)
         {
            coltotal[col]+=num[row][col];
         }
      }
      return coltotal;
   }
   
   public static int[] getHighestInRow(int[][] num)
   {
      int[] highest = new int[10];
      
      for(int row = 0; row < num.length; row++)
      {
         highest[row] = num[0][0];
         
         for(int col = 0; col < num[row].length; col++)
         {  
            if(num[row][col] > highest[row])
            {
               highest[row] = num[row][col];
            }
         }
      }      
      return highest;
   }
   
   public static int[] getLowestInRow(int[][] num)
   {
      int[] lowest = new int[10];

      for(int row = 0; row < num.length; row++)
      {  
         lowest[row] = num[0][0];
         
         for(int col = 0; col < num[row].length; col++)
         {
            if(num[row][col] < lowest[row])
            {
               lowest[row] = num[row][col];
            }
         }
      }      
      return lowest;
   } 
}
        
        
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      
   