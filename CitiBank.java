public class CitiBank
{
	private String name;
	private double balance;
   private double interestRate;
   
	public void setName(String n) 
	{
		name = n;
	}
	
	public void setBalance(double b)
	{
		balance = b;
	}
   
   public void setInterestRate(double ir)
   {
      interestRate = ir;
   }
	
	public String getName()  
	{
		return name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
   public double getinterestRate()
   {
      return interestRate;
   }
   
	public double interestRate()
	{
	   double interestAmt = balance * interestRate;
      return interestAmt;
	}
}