// Shanika Seales 2/28/2017

import java.util.*;

public class doublearray
{
	public static void main (String [] arg)
	{
		Scanner input = new Scanner(System.in);	
		int[][] array1;
		int row, col;
		double totalrow = 0.0, totalcol = 0.0;
     	array1 = new int[3][4];
     	
     	for(row =0; row<3; row++)
     	{
       		for(col = 0; col<4; col++)
       		{
       			System.out.print("array1["+row+"]["+col+"]:  ");
         		array1[row][col] = input.nextInt();
        	   }
      }
    	
     	for(row =0; row<3; row++)
     	{
     		for(col = 0; col<4; col++)
       		{ 
          		System.out.print ( array1[row][col] + " ");
        	}
        	System.out.println(); 
     	}
     
     	for(row = 0; row <3; row++)
     	{
     		for(col = 0; col<4; col++)
     		{
     			totalcol+=array1[row][col];
     		}
     	}
     	System.out.println("Total of column is " +totalcol);	
	}
}