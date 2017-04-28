import java.util.Scanner;

public class linearsearch
{
   public static void main (String[] args)
   {
   	Scanner input = new Scanner(System.in);
	
   	int[] array = {2,5,3,7,1,9,0,5};	
   	System.out.println("What is your number?");
   	int number = input.nextInt();
   	checkNumber(number, array);
   }
   
   public static void checkNumber(int n, int[] A) //the parameter int[]
   {
     String answer = "no";    
     for(int i = 0; i < 8; i++)
     {
       if (n==A[i])
         answer = "yes";
     }
     System.out.println(answer);
   }
}