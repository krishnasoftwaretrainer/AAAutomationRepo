package abstraction_Interface;

interface Parent1 {
	public void Father1();
}
interface Parent2 {
	public void Father2();
}

interface Parent3 {
	public void Father3();
}

public class MultipleIH implements Parent1,Parent2,Parent3
{
	public void Father1() {
		System.out.println("This is Father1 method");
	}
	public void Father2() {
		System.out.println("This is Father2 method");
	}
	public void Father3() {
		System.out.println("This is Father3 method");
	}
	
}
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
