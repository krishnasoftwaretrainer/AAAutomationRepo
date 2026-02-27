package testngscripts;

import org.testng.annotations.Test;

public class SampleTestngScript
{
	
	@Test(priority=1,invocationCount=2)  //Least Priority value will get executed first
	public void India()
	{
		System.out.println("This is Sample India Method");
		
	}
	
	@Test(priority=2,invocationCount=3) //This method will be executed 3 times
	public void Telengana()
	
	{
		System.out.println("This is Sample Telengana Method");
		
	}
	
	@Test(priority=3,enabled=false) //This method will be skipped
	public void Hyderabad()
	{
		System.out.println("This is Sample Hyderabad Method");
		
	}
	
	
}
