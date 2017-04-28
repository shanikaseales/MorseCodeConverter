public class isdigit
{
   public static void main (String [] arg)
   {
      String str = "thisis1289";
      boolean answer;
      answer = stringtest(str);
      System.out.println("The answer is "+answer);
     
   }
   public static boolean stringtest(String s)
   {
     int l = s.length();
     if (l != 10)
      return false;
     for (int i = 0; i<= 9; i++);
     {
      if (s.charAt(i)>='0'&& s.charAt(i)<='9')
      return true;
     }
     return false;
   }
}