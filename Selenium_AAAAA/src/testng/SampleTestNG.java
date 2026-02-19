package testng;

import org.testng.annotations.Test;

public class SampleTestNG 
{
	@Test(priority=0)
	public void India()
	{
		System.out.println("India is my country");
	}
	
	@Test(priority=1,enabled=false)
	public void Telangana()
	{
		System.out.println("Telangana is my state");
	}
	
	@Test(priority=2,invocationCount=3)
	public void Hyderabad()
	{
		System.out.println("Hyderabad is my city");
	}
}
