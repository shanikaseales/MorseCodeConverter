import java.util.Random;

public class dice
{
   public static void main(String [] arg)
   {   
      Random rand = new Random();
	   int[] c = new int[13];
	   int[] sum = new int[100];
	   int dice1, dice2;
     
      for(int roll = 0; roll <= 100; roll++)
      {
         dice1 = 1 + rand.nextInt(6);
         dice2 = 1 + rand.nextInt(6);
         sum[roll] = dice1 + dice2;
         System.out.println(sum[roll] + " ");
         System.out.println("\n=====================");
      }
      
      for(int roll=0; roll<c.length; roll++)
		   System.out.print("*");
		   System.out.println();
  }  
}