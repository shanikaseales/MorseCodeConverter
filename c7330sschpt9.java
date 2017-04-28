public class c7330sschpt9
{
	public static void main (String[]arg)
	{
		char x = 'L', y = 'g';
		
		isDigit(x, y);
		System.out.println();
		isLetter(x, y);
		System.out.println();
		isLetterOrDigit(x, y);
		System.out.println();
		isLowerCase(x, y);
		System.out.println();
		isUpperCase(x, y);
		System.out.println();
		isSpaceChar(x, y);
      System.out.println();
      isWhiteSpace(x, y);
		
	}
	
	public static void isDigit(char x, char y)//, char ac)//Good
	{
		System.out.println("isDigit");
		System.out.println(Character.isDigit('x'));
		System.out.println(Character.isDigit('y'));
		System.out.println(Character.isDigit('5'));
	}
	
	public static void isLetter(char x, char y)//good
	{
		System.out.println("isLetter");
		System.out.println(Character.isLetter('x'));
		System.out.println(Character.isLetter('y'));
		System.out.println(Character.isLetter('5'));
	}
	
	public static void isLetterOrDigit(char x, char y)//good
	{
		System.out.println("isLetterOrDigit");
		System.out.println(Character.isLetterOrDigit('x'));
		System.out.println(Character.isLetterOrDigit('y'));
		System.out.println(Character.isLetterOrDigit('5'));
	}
	
	public static void isLowerCase(char x, char y)//good
	{
		System.out.println("isLowerCase");
		System.out.println(Character.isLowerCase(x));
		System.out.println(Character.isLowerCase(y));
		System.out.println(Character.isLowerCase(5));
	}
	
	public static void isUpperCase(char x, char y)//giving all as false
	{
		System.out.println("isUpperCase");
		System.out.println(Character.isUpperCase(x));
		System.out.println(Character.isUpperCase(y));
		System.out.println(Character.isUpperCase('5'));
	}
	
	public static void isSpaceChar(char x, char y)//good
	{
		System.out.println("isSpaceChar");
		System.out.println(Character.isSpaceChar('x'));
		System.out.println(Character.isSpaceChar('y'));
      System.out.println(Character.isSpaceChar(' '));
	}
   
   public static void isWhiteSpace(char x, char y)//good
	{
		System.out.println("isWhiteSpace");
		System.out.println(Character.isSpaceChar('x'));
		System.out.println(Character.isSpaceChar('y'));
      System.out.println(Character.isSpaceChar(' '));
	}
}