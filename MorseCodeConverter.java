//Shanika Seales 4/11/17

import javax.swing.JOptionPane;
import java.util.*;

public class MorseCodeConverter
{
   public static void main (String [] arg)
   {
      char[] letter = {' ', ',', '.', '?', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 
      String[] code = {" ", "--..--", ".-.-.-", "..--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
      
      getOption(letter, code);
   }
   
   public static void getOption(char[] letter, String[] code)
   {
      Scanner input =  new Scanner(System.in);
      String user, text, in;
      char[] ch = new char[50];
      int i=0;
      
      System.out.print("Do you want to convert to English or Morse Code.\nPlease enter English or Morse: ");
      user = input.next();
      
      if(user.equals("English") || user.equals("english") )
      {
         System.out.print("Enter the text you would like to convert to Morse Code: ");
         text = input.next();
         ch[i] = text.charAt(0); //.toUpperCase();
         ch = text.toCharArray();
         //Character.isUpperCase(text);
         toMorse(ch, code, letter);
         i++;
      }
      /*else if (user.equals("Morse") || user.equals("morse"))
      {
         System.out.print("Enter the text you would like to convert to English and separate words with '|': ");
         text = input.next();
            
         ch[i] = (text.split("|", 0));
         System.out.println(toEnglish(ch, character));
         i++;
      }
      /*else
      {
         System.out.println("Invalid input. Please try again.");
         
         while(!ans.equals("English") || !user.
         System.out.println("Do you want to do this again?\nEnter an upper case Y or N");
         String ynstr = input.next();
         char yn = input.charAt(0);
      
         if(Character.toLowerCase(yn) == 'y');
         {
            getOption(character, code);
         }
      }*/
   }
   
   public static String getSearch(char[] letter, char[] ch)
   {
      int i =0;
      char[] element = {' '};
      boolean found;
      
      found = false;
      
      while(!found && i < letter.length)
      {
         if(letter[i] == ch[i])
         {
            found = true;
            element[i]= ch[i];
         }
         i++;
      }
   }
   
   public static String toMorse(char[] ch, String[] code, char[]letter)
   {
      String mc = " ";
      String results;
      results = getSearch(letter, ch);  
      
         for (int j = 0; j < ch.length; j++)
         {
            char a = ch[j];
            if(Character.isLetter(a))
            {
               mc = code[a + a];
            }
         }
         return mc;
   }
   
   /*public static String toEnglish()
   {
   }*/
}