import java.util.*;

public class mystery
{
  public static void main(String[] args)
  {
    Random rand = new Random();
	 int num,i,j;
	 //*************************
	 int[] count;
	 count = new int[6];
	 for (i = 1;i<=20;i++)
	 {
	   num = rand.nextInt(6);
		count[num ]++;
		System.out.print(num+" ");
	 }
	 System.out.println("================");
	 for (i = 0 ;i<=5;i++)
	 {
	   System.out.print ("There were "+count[i]+" "+i+"s ");
	   for(j= 0;j  <= count[i]-1;j++)
		   System.out.print("*");
		System.out.println();
	  }
	 System.exit(0);
	}
}