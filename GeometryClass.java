//Shanika Seales 8/04/2017

import java.util.*;

public class GeometryClass
{   
   public static double getAreaOfCircle(Scanner input, double r)
   {    
      while(r < 0)
      {
         System.out.print("Error! Please re-enter the radius: ");
         r = input.nextDouble();
      }
      return Math.PI * r * r;
   }
   
   public static double getAreaOfRectangle(Scanner input, double l,  double w)
   {      
      while(l < 0)
      {
         System.out.print("Error! Re-enter the length: ");
         l = input.nextDouble();
      }
      
      while(w < 0)
      {
         System.out.print("Error! Re-enter the width: ");
         w = input.nextDouble();
      }
      return l * w;
   }

   public static double getAreaOfTriangle(Scanner input, double b, double h)
   {
      while(b < 0)
      {
         System.out.print("Error! Please re-enter the base: ");
         b = input.nextDouble();
      }
      while(h < 0)
      {    
         System.out.print("Error! Please re-enter the height: ");
         h = input.nextDouble();
      }
      return b * h * 0.5;
   } 
}