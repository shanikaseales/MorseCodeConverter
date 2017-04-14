//Shanika Seales 4/11/17

import java.util.*;

public class MorseCodeConverter
{
   public static void main (String [] arg)
   {
      String[] character = {" ", ",", ".", "?", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}; 
      String[] code = {" ", "--..--", ".-.-.-", "..--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
      
      getOption(character, code);
   }
   
   public static void getOption(String[] character, String[] code)
   {
      Scanner input =  new Scanner(System.in);
      String user, text;
      char[] ch;
      int i=0;
      
      System.out.print("Do you want to convert to English or Morse Code. Please enter English or Morse: ");
      user = input.next();
      
      if(user.equals("English") || user.equals("english") )
      {
         System.out.print("Enter the text you would like to convert to Morse Code: ");
         text = input.next();
            
         ch[i] = text.chartAt(i);//text.toUpperCase().toCharArray();
         //System.out.println(toMorse(ch, code));
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
         
         System.out.println("Do you want to do this again?\nEnter an upper case Y or N");
         String ynstr = input.next();
         char yn = input.charAt(0);
      
         if(Character.toLowerCase(yn) == 'y');
         {
            getOption(character, code, user, text, ch, input);
         }
      }*/
   }
   
   /*public static String toMorse(char[] ch, String code)
   {
      String morse = " ";
         for (int j = 0; j < ch.length; j++)
         {
            char a = ch[j];
            if(Character.isLetter(a))
            {
               morse = code[a + 'a'];
            }
         }
         return morse;
   }
   
   /*public static String to English()
   {
   }*/
}