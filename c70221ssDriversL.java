// Shanika Seales 2/21/2017

import java.util.*;

public class c70221ssDriversL
{   
   public static void main(String[]arg)
   {
      Scanner input = new Scanner(System.in);
      //Question #s ={ 0 ,  1 ,  2 ,  3 ,  4 ,  5 ,  6 ,  7 ,  8 ,  9 , 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19} 
      String[] key = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
      String[] user = new String[20];
      int[] missed = new int[20];
      int correct, tmissed;
      boolean passfail;
      
      valid(user);
      correct = totalCorrect(key, user); 
      tmissed = totalMissed(key, user);
      missed  = questionsMissed(key, user, tmissed);
      passfail= passed(correct);
         
      System.out.println("Total Correct is " + correct);
      System.out.println("Total Missed is " + tmissed);
      System.out.print("Questions Missed is ");
      for(int c = 0; c < missed.length; c++)
      {
      	System.out.print(missed[c] + " ");
      }
      
      if(passfail == true)
      {
      	System.out.println();
      	System.out.print("You Pass. Congratulations.");
   	  }
   	  else
   	  {
   	  	System.out.println();
   	  	System.out.println("You Fail. Please try again next time.");
   	  }
   }
   
   public static void valid(String[] user) //GOOD
   {
      Scanner input = new Scanner(System.in);
      
      for(int c = 0; c < 20; c++)
      {
         do
         { 
         	System.out.println("Enter a captial letter " + (c+1));
            user[c] = input.next();
            if(!user[c].equals("A") && !user[c].equals("B") && !user[c].equals("C") && !user[c].equals("D"))
            {
               System.out.println("Re-enter a captial letter");
            }
         }while(!user[c].equals("A") && !user[c].equals("B") && !user[c].equals("C") && !user[c].equals("D"));
      }
   }
   
   public static int totalCorrect(String[] key, String[] user) //GOOD
   {
      int correct = 0;
      
      for(int c = 0; c < 20; c++)
      {
         if (key[c].equals(user[c]))
         {
            correct++;
         }
      }
      return correct;
   }
   
   public static int totalMissed(String[] key, String[] user) //GOOD
   {
      int tmissed = 0;
   
      for(int c = 0; c < 20; c++)
      {
         if(!key[c].equals(user[c]))
         {
            tmissed++;
         }
      }      
      return tmissed;
   }
   
   public static int[] questionsMissed(String[] key, String[] user, int tmissed) //GOOD
   {
      int[] missed = new int[tmissed];
      int pos = 0;
      
      if(tmissed <= 20)
      {
         for (int c = 0; c < key.length; c++)
         {
         	if(!key[c].equals(user[c]))
         	{
	            missed[pos] = c+1;
	            pos++;  
         	}
         }
      }
      return missed;
   }
   
   public static boolean passed(int correct)
   {
	  if(correct >= 15)
	  {
	  	 return true;
	  }
	  return false;
   }
}