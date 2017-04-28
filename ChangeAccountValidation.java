//Shanika Seales 2/16/2017

import java.util.Scanner;

public class ChangeAccountValidation
{
   static int [] account = {5658845, 8088152, 1005231, 4520125, 4562555, 6545231, 7895122, 5552012, 3852085, 8777541, 5050552, 7576651, 8451277, 7825877, 7881200, 1302850, 1250255, 4581002};
   
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
        
      System.out.print("Enter the account number: ");
      int number = input.nextInt();                   

      if (isValid(number) == true)           
      {
         System.out.println("The number is valid.");
      } 
      else 
      {
         System.out.println("That number is invalid.");
      }
    }

    public static boolean isValid(int number) 
    {
      for (int i = 0; i < account.length; i++) 
      {
         if (number == account[i])
         {
            return true;
         }
      }
      return false;
    }
}