package methods;

public class Constructor 
{
	int a=10;  //Instance Variable
	String name;  //Instance Variable
	double price;  //Instance Variable
	boolean status;  //Instance Variable
	//public Constructor()  //Default Constructor
	
	
	//public Constructor(String browser)  //User Defined Constructor
	{
		System.out.println("This is User Defined Constructor");
		//System.out.println("Student Name is: " + browser);
		System.out.println("Value of a is: " + a);
		System.out.println("Value of name is: " + name);
		System.out.println("Value of price is: " + price);
		System.out.println("Value of status is: " + status);
	}
	
	
	public static void main(String[] args) 
	{
		//Constructor obj = new Constructor("chrome");  //Object Creation
		Constructor obj = new Constructor();  //Object Creation
		
	}
}
