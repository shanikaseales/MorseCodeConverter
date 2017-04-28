// SSeales 02/07/2017

import java.util.*;

public class c70207asprob1
{
   public static void main(String [] arg)
   {
      Scanner input = new Scanner(System.in);
      
      int[] grades;
      grades = new int[35];
         
      int sum = 0, avg = 0;
      
      for(int counter = 0;counter<grades.length;counter++)
      {
        System.out.println("Enter the grades ");
        grades[counter] = input.nextInt();
        sum+=grades[counter];
        avg = sum/grades.length;        
      }
      System.out.println("the sum of the grade is " + sum);
      System.out.println("the average grade is " + avg);
   }
}