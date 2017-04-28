//Shanik Seales 2/21/2017

import java.util.*;

public class c70221ssLotteryA
{   
   public static void main (String [] arg)
   {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      int[] lotteryNumbers = new int[5];  
      int[] user = new int[5];
      int match = 0;
  
      for(int roll = 0; roll < 5; roll++)
      {  
         System.out.print("Enter a number:  ");
         user[roll] = input.nextInt();
         
         lotteryNumbers[roll] = rand.nextInt(10);
         match = compare(user, lotteryNumbers);
      }
      
      System.out.println();
      System.out.print("Lottery Numbers are ");
      for(int r = 0; r < 5; r++)
      {  
         System.out.print(lotteryNumbers[r] + "  ");
      }
      
      System.out.println();
      System.out.print("Your numbers are    ");
      for(int ro = 0; ro < 5; ro++)
      {
      	System.out.print(user[ro] + "  ");
      }
      System.out.println();    
      System.out.println("Total match: " + match);  
   }
   
   public static int compare(int[] u, int[] lN) //good
   {  
      int match = 0; 
      
      if(u.length == lN.length)
      {
      	for(int roll = 0; roll < 5; roll++)
      	{
         	if(u[roll] == lN[roll]) 
         	{
               match++;
            }
         }
      } 
      return match;
   }
}