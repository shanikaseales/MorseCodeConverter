import java.util.*;

public class dice2
{
   public static void main(String [] arg)
   {   
      Random rand = new Random(); // creates different random numbers
      
      /* if we throw dice we need two numbers from 1-6
       * then add them together to a total */
       
	   int[] totals, count;
	   totals = new int[100]; // saving each throw from 100
	   count = new int[13]; // count 0-12
       int die1, die2;
       
      for(int roll = 0; roll <= 99; roll++)
      {
         die1 = 1 + rand.nextInt(6);
         die2 = 1 + rand.nextInt(6);
         totals[roll] = die1+die2;
         System.out.println(totals[roll] + " ");
         count[totals[roll]]++;
      }
      // print totals in reverse
      System.out.println();
      System.out.println();
      
      for(int roll = 99; roll >= 0; roll--)
      {
      	System.out.print(totals[roll]+ " ");
      }
      
      System.out.println();
      System.out.println();
      	
      //print the count
      for(int roll = 2; roll <= 12; roll++)
      {
      	System.out.println("The were " + count[roll] + " number of " + roll + " s ");
      }
   }   	 
}