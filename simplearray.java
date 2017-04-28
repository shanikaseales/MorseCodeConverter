import java.util.*;

public class simplearray
{
   public static void main (String [] arg)
   {
      Scanner input = new Scanner(System.in);
      int[] array;
      array = new int[6];
      int i;
      for(i = 1; i<=5; i ++)
      {
         System.out.println("Enter array ["+i+"]");
         array[i] = input.nextInt();
      }
      
      for(i = 1; i<=5; i --)
      {
         System.out.println("Enter array ["+i+"]");
         array[i] = input.nextInt();
      } 
   }
}