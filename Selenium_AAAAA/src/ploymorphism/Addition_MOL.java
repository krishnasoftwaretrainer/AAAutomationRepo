package ploymorphism;

public class Addition_MOL {

	public void Addition()
	{
		
	}
	
	public void Addition(int a)
	{
		
	}
	//Number of arguments/parameters
	public void Addition(int a, int b)
	{
		int c = a + b;
		System.out.println("Addition of two integers: " + c);
	}
	
	public void Addition(int a, int b, int d)
	{
		int c = a + b + d;
		System.out.println("Addition of three integers: " + c);
	}
	
	public void Addition(int a,int b,int c,int d)
	{
		int e=a+b+c+d;
		System.out.println("Addition of three integers: " + e);
	}
	
	public void Sub(double a,double b)
	{
		double sub=a-b;
		System.out.println(sub);
	}
	
	public void Sub(byte a,byte b)
	{
		byte sub=(byte) (a-b);
		System.out.println(sub);
		
	}
	
	public void Mul(int a,double b)
	{
		
	}
	
	public void Mul(double a,int b)
	{
		
	}
	public static void main(String[] args) {
		
		Addition_MOL aa=new Addition_MOL();
		aa.Addition(10, 20);
		aa.Addition(10, 20, 30);
		aa.Addition(10, 20, 30, 40);
		
	}
	
}
