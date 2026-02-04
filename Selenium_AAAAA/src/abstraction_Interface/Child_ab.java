package abstraction_Interface;

public class Child_ab extends Parent_ab
{
	public void Loan()
	{
		System.out.println("This is Loan method from Child_ab class");
	}
	
	public static void main(String[] args) {
		Child_ab obj = new Child_ab();
		obj.IntrestRate();
		obj.Loan();
	}
}
