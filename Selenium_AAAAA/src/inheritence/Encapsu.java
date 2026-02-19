package inheritence;

public class Encapsu {

	public long accno=1111;
	private int balance;
	private String accname;
	
	
	
	public void setbalance(int balance)
	{
		this.balance=balance;
	}
	
	public void setaccname(String accname)
	{
		this.accname=accname;
	}
	
	public long getaccno()
	{
		return accno;
		
	}
	
	public int getbalance()
	{
		return balance;
	}
	public String getaccname()
	{
		return accname;
	}
}
