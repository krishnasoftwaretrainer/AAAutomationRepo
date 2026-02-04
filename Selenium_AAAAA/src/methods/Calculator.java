package methods;

public class Calculator 
{

	public static void Addition()  //Without Return type and Without Parameter
	{
		int a = 10; //Variables 
		int b = 20;
		int c = a + b;
		System.out.println("Addition is: " + c);
	}
							//Parameters Method Calling
	private void Subtraction(int a, int b)  //Without Return type and With Parameter
	{
		int c = a - b;
		System.out.println("Subtraction is: " + c);
	}
	
	protected static int Multiplication()  //With Return type and Without Parameter
	{
		int a = 20;
		int b = 10;
		int c = a * b;
		return c;
	}
	
	 int Division(int a, int b)  //With Return type and With Parameter
	{
		int c = a / b;
		return c;
	}
	
	
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();  //Object Creation
		Calculator.Addition();  //Static Method Calling
		calc.Subtraction(20, 10);
		//scan.nextInt();
		
		//System.out.println("Multiplication is: " + Calculator.Multiplication());
		int mul=Calculator.Multiplication();
		System.out.println("Multiplication is: " + mul);
		
		int div=calc.Division(20, 10);
		System.out.println("Division is: " + div);
	
	}
}
