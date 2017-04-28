import java.util.*;
// numbers from 1 to 6 but no 3a
public class validation
{
   public static void main (String[] args)
	{
	    Random rand = new Random();
       int  randNum;
       for(int i = 1; i<=25;i++)
		 {
       
		   randNum = 1 + rand.nextInt( 6 ); 
         while(randNum==3)
         randNum = 1 + rand.nextInt( 6 ); 

         System.out.println(randNum);              
		 }
	   System.exit(0);
   }
}
