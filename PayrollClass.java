//Shanika Seales 2/16/2017

import java.util.Scanner;

public class PayrollClass
{
	  private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
     private double[] wages = new double[7]; 
     private int[] hours = new int[7];
     private double[] payRate = new double[7];
     private int id;
	
   public static void main (String [] arg)
   {
      Scanner input = new Scanner(System.in);
      PayrollClass prc = new PayrollClass();

      for(int c = 0; c < 7; c++) 
      {
      	System.out.println("Enter your seven digit Employee ID");
         prc.id = input.nextInt();
         
      	while(prc.checkEmployee(prc.employeeId, prc.id)== false)
	      {
	         System.out.println("Your ID is not in the system.");
	         System.out.println("Enter your seven digit Employee ID");
	         prc.id = input.nextInt();
	      }
	      
      
         System.out.println("Enter number of hours worked");
         prc.hours[c] = input.nextInt();
         prc.valid(prc.hours);
      
         prc.valid1(c);

        prc.wages[c] = prc.payRate[c] * prc.hours[c];            
      }
      
      for(int c=0; c<7; c++) 
      {
         System.out.println("Employee ID is " + prc.employeeId[c] + " Total wage is $" + prc.wages[c]);
      }
   }
   
   public boolean checkEmployee( int[] E,int i)
   {   	
     for(int c = 0; c < 7; c++) 
     {
       if (i==E[c])
       {
         System.out.println();
         System.out.println("Your ID is in the system.");
         System.out.println();
         return true;
       }
     }
     return false;
   }
   
   public void valid(int[] h)
   {
      Scanner input = new Scanner(System.in); 
      int[] hours = new int[7];
     
     for(int c = 0; c < 7; c++) 
     {
       if( h[c] < 0)
       {
         System.out.println("Enter number of hours worked");
         hours[c] = input.nextInt();
       }
     }  
   }
   
   public void valid1(int c)
   {
      Scanner input = new Scanner(System.in);
  
      do
      {               
      	System.out.println("Enter hourly pay rate");
        payRate[c] = input.nextDouble();
      }while (payRate[c] <= 6);
   }
}