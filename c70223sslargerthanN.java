//Shanika Seales 2/23/2017

import java.util.*;

public class c70223sslargerthanN
{
   public static void main (String [] arg )
   {
      Random rand = new Random();
      Scanner input = new Scanner(System.in);
      
      int[] array = new int[10];
      int n, array1;
      
      System.out.println("Enter a number");
      n = input.nextInt();
      
      for(int c = 0; c<array.length; c++)
      {
         array[c] = 1 + rand.nextInt(10);
         if(n<array[c])
         {
           System.out.println(array[c]);
         }
      }
   }
}