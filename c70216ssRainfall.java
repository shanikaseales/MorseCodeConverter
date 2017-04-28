// Shanika Seales 2/16/2017

import java.util.Scanner;

public class c70216ssRainfall
{
    public static void main (String[] args)
    {
      Scanner input = new Scanner(System.in);
      
      double rain[] = new double[12]; 
      double sum = 0, avg = 0, most = rain[0], least = rain[0];
      int month = 1;

      System.out.println("Please enter in the following rainfall for the months ahead: ");
      System.out.println("Month\tRainfall (In inches)");
      
      while(month < 4) //12
      {
      	for(int c = 0; c<4; c++) //12
      	{
         	System.out.print("Month " + month +":");
        	   rain [c] = input.nextDouble();
            check(rain, c);
         
         	sum += rain[c];
         	month++;
                        
            if (rain[c]>most)
            {
               most = rain[c];
            }
            else
            {
               least = rain[c];
            }
      	}
         	avg = sum / 4; //12
            
         	System.out.println("The sum of all the rain is: " + sum);
         	System.out.println("The average rainfall was: " + avg + " inches");
            System.out.println("The Month with most rain is " + most);
            System.out.println("The Month with least rain is " + least);            
      }  	
    }
    
    public static void check(double[] r, int c)
    {
       Scanner input = new Scanner(System.in);
 		 double[] rain = new double [12]; 
       
         if( r[c] < 0)
         {
           System.out.println("Enter rainfall for month");
 	        rain[c] = input.nextDouble();         
         }
    }
}