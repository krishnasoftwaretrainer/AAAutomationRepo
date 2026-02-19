package inheritence;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test123 {

	public static void main(String[] args) 
	{
		Thread.currentThread().interrupt();
		try
		{
		FileReader fr = new FileReader("abc.txt");
		}
		catch(FileNotFoundException f)
		{
			System.out.println(f.getMessage());
		}
		try
		{
		Thread.sleep(2000);
		}
		catch(InterruptedException i)
		{
			i.printStackTrace();
			//System.out.println(i.getMessage());
		}
	}

}
