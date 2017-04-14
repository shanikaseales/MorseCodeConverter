//Shanika Seales 8/04/2017

import java.util.*;

public class AreaClassMain
{
   public static void main (String [] arg)
   {
      Scanner input = new Scanner(System.in);

      double radius = 0, height = 0;
      int length = 0, width = 0;
      
      System.out.println("Enter the radius: ");
      radius = input.nextDouble();
      
      System.out.println("Enter the length: ");
      length = input.nextInt();
      
      System.out.println("Enter the width: ");
      width = input.nextInt();
      
      System.out.println("Enter the height: ");
      height = input.nextDouble();
      
      System.out.println("The area of a cricle with a radius of " + radius + " is " + AreaClass.getCalculateArea(radius)); 
      System.out.println("The area of a rectangle with a length of " + length + " and a width of " + width + " is " + AreaClass.getCalculateArea(length, width));    
      System.out.println("The area of a cylinder with a radius of " + radius + " and a height of " + height + " is " + AreaClass.getCalculateArea(radius, height));
   }
}