import java.util.*;

public class randArraydouble
{
   public static void main (String[] args)
	{
	    Random rand = new Random();
       double randNum, randNum2,sum;
       double roundR;
       
	    for(int i = 1; i<=25;i++)
		 {
		   randNum = 6*rand.nextDouble(  ); 
         roundR = createTwoDec(randNum);
			System.out.println(randNum+"    "+roundR );             
		 }
	   System.exit(0);
   }
   
   public static double createTwoDec(double r)
   {
      double  x =( (int)(r*100+.5))/100.;
      return x;
   }
}