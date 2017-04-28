import java.util.*;

public class randArray
{
   public static void main (String[] args)
	{
	    Random rand = new Random();
       int randNum, randNum2,sum;
	    for(int i = 1; i<=25;i++)
		 {
		   randNum = rand.nextInt(6 )+1;
			randNum2 = rand.nextInt(6 )+1;
			sum = randNum+randNum2;
	      System.out.println(randNum+"  + "+randNum2+" = "+sum);
		 }
	
	
	   System.exit(0);
   }
}
