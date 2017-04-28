import java.util.*;

public class c7404sstable93
{
   public static void main (String[]arg)
   {
      Scanner in = new Scanner(System.in);
      
      String input;
      String[] str = {"Seales, Shanika", "Bishop, Shem", "Seales, Richaline", 
                    "Davis, George", "Smith, Chris", "Williams, Jean",
                    "Smith, Brad", "Smathers, Holly", "Setzer, Charles"};
      
      System.out.println("Enter the first few characters of the last name to look up: ");
      input = in.nextLine();
      
      System.out.println();
      System.out.println("Here are the names that match: ");
      for (String person : str)
      {
         if(person.startsWith(input))
           System.out.println(person);
      }
      
      System.out.println();
      System.out.println("endsWith Method");
      endsWith();
      System.out.println();
      System.out.println("regionMatches Method");
      regionMatches();
   }
   
   public static void endsWith()
   {
      String text = "Four score and seven years ago";
      if (text.endsWith("ago"))
      {
         System.out.println("The string ends with ago.");
      }
      else
      {
         System.out.println("The string does not end with ago.");
      }
   }
   
   public static void regionMatches()
   {
      String inp = "Four score and seven years ago";
      String inp2 = "Those seven years passed quickly";
      if (inp.regionMatches(true, 15, inp2, 6, 11))
      {
         System.out.println("The regions match.");
      }
      else
      {
         System.out.println("The regions do not match.");
      }
   }
}