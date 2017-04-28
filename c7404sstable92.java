import java.util.*;

public class c7404sstable92
{
   public static void main (String [] arg)
   {
      Scanner input = new Scanner(System.in);
      
      double radius, area;
      String word;
      char w;
      
      do
      {
         System.out.print("Enter the circle's radius: ");
         radius = input.nextDouble();
         
         input.nextLine();
         area = Math.PI * radius * radius;
         System.out.printf("The area is %.2f.\n", area);
         
         System.out.print("Do you want to do this " + " again? (Y or N) ");
         word = input.nextLine();
         w = word.charAt(0);
      }while(Character.toUpperCase(w) == 'Y' || Character.toLowerCase(w) == 'y');
    }
}