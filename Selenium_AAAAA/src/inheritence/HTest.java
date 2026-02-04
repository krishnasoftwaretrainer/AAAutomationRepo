package inheritence;

public class HTest {

	public static void main(String[] args) {

		HChild1 c1=new HChild1();
		c1.ChromeBrowser();
		c1.AmazonApp();
		
		System.out.println("**********************");
		
		HChild2 c2=new HChild2();
		c2.ChromeBrowser();
		c2.FlipkartApp();
		
		System.out.println("**********************");
		
		HChild3 c3=new HChild3();
		c3.ChromeBrowser();
		c3.EbayApp();
	}

}
