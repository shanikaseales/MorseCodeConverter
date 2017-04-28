import java.util.*;

public class copypass
{
  public static void main(String[] args)
  {
    Random rand = new Random();
	 double num;
	 //*************************
	 double[] myarray ;
	 myarray = new double[10];
	 //**************************
	 int i;
	 // create 10 doubles from 7 to 12
	 // delta 12-7  = 5  number to 11.99999
	 for(i = 1;i<=10;i++)
	 {
	    num = 7 + 5*rand.nextDouble();
		 myarray[i-1] = num;
		 System.out.print(num+" ");
	 }
    System.out.println();
      System.out.println();
	 double[] copyarray;
    copyarray = new double[10];
    copyarray = myarray;
    for(i = 0;i<10;i++)
    
       System.out.print(copyarray[i]+" ");	
    System.out.println();
    System.out.println();
       
     methodprint(copyarray);
     System.out.println(copyarray[9]);
	 System.exit(0);
	}
   public static void methodprint(double[] x)
  {
      for(int i = 0;i<10;i++)
         System.out.println(x[i]);
      x[9]=3.14;
   }
 } 