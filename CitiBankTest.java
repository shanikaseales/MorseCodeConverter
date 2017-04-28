import java.text.DecimalFormat;

public class CitiBankTest
{
   public static void main (String [] args)
   {      
      double interestAmt, newBalance;
            
      DecimalFormat df = new DecimalFormat("0.00");
      
      CitiBank a1 = new CitiBank();
      
      a1.setName("Larry");
		a1.setBalance(3000);
      a1.setInterestRate( 0.15 );
      
      interestAmt = a1.interestRate();
      newBalance = a1.getBalance() + interestAmt;
            
		System.out.println("\nName of employee: " + a1.getName() +  
						       "\nRate is " + a1.getinterestRate() +
                         "\nBalance is $" + a1.getBalance()+
                         "\nNew Balance is $" + newBalance);
                         
      CitiBank a2 = new CitiBank();
      
      a2.setName("Louis");
      a2.setBalance(100000);
      a2.setInterestRate(0.04);
      
      interestAmt = a2.interestRate();
      newBalance = a2.getBalance() + interestAmt;
      
      System.out.println("\nName of employee: " + a2.getName() +  
						       "\nRate is " + a2.getinterestRate() +
                         "\nBalance is $" + a2.getBalance() +
                         "\nNew Balance is $" + newBalance);
                         
      
      
     /* if (a1.newBalance() < a2.newBalance())
			System.out.println(a1.getName() + " has the smallest balance");
		else
			System.out.println(a2.getName() + " has the smallest balance");     */
   }
}