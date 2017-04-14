//Shanika Seales 8/04/2017

import java.util.*;

public class GeometryClassMain
{
   public static void main (String [] arg)//good
   {
      Scanner input = new Scanner(System.in);
      int option;
      
      System.out.println("Welcome to the Geometry Calculator");
      System.out.println();
      System.out.println("1. Calculate the Area of a Circle");
      System.out.println("2. Calculate the Area of a Rectangle");
      System.out.println("3. Calculate the Area of a Triangle");
      System.out.println("4. Quit");
      System.out.println();
      System.out.print("Enter your choice: ");
      option = input.nextInt();
      
      if(option == 1)
      {
         System.out.println();
         getCircle(input);
      }
      else if(option == 2)
      {
         System.out.println();
         getRectangle(input);
      }
      else if(option == 3)
      {
         System.out.println();
         getTriangle(input);
      }
      else
      {
         System.out.println();
         getQuit(input);
      }
   }
   
   public static void getCircle(Scanner input)//good
   {
      double radius;
      
      System.out.println("You have chosen to Calculate the Area of a Circle");
      System.out.print("Enter the radius: ");
      radius = input.nextDouble();
      
      System.out.println("The Area of the Circle is " + GeometryClass.getAreaOfCircle(input, radius));
   }
   
   public static void getRectangle(Scanner input)
   {
      double length, width, area;
      
      System.out.println("You have chosen to Calculate the Area of a Rectangle");
      System.out.print("Enter the length: ");
      length = input.nextDouble();
      System.out.print("Enter the width: ");
      width = input.nextDouble();

      System.out.println("The Area of the Circle is " + GeometryClass.getAreaOfRectangle(input, length, width));
   }

   public static void getTriangle(Scanner input)
   {
      double base, height;
      
      System.out.println("You have chosen to Calculate the Area of a Triangle");
      System.out.print("Enter the base: ");
      base = input.nextDouble();
      System.out.print("Enter the height: ");
      height = input.nextDouble();

      System.out.println("The Area of the Circle is " + GeometryClass.getAreaOfTriangle(input, base, height));
   }
   
   public static void getQuit(Scanner input)
   {
      System.out.println("You have chosen to Quit");
      //System.out.println();
   }   
}