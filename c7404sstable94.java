public class c7404sstable94
{
   public static void main (String [] arg)
   {
      String str = "Four score and seven years ago";
      int first, last;
      
      first = str.indexOf('r');
      last = str.lastIndexOf('r');
      
      System.out.println("The letter r first appears at position " + first);
      System.out.println("The letter r last appears at position " + last);
      
      indexOf(str);
   }
   
   public static void indexOf(String str)
   {
      int position;
     
      System.out.println("The letter r appears at the following locations:");
      position = str.indexOf('r');
     
      while (position != -1)
      {
         System.out.println(position);
         position = str.indexOf('r', position + 1);
      }
   }
}