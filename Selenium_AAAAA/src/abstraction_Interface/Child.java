package abstraction_Interface;

 abstract interface  Parent_int 
{
	public abstract void  Loan();
	
	public abstract void IntrestRate();
	
}

public class Child  implements Parent_int
{
	
	public void Loan() {
		System.out.println("This is Loan method");
	}
	public void IntrestRate() {
		System.out.println("This is IntrestRate method");
	}

}
