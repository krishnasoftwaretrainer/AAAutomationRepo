package inheritence;

public class EncapsuTest {

	public static void main(String[] args) {
		Encapsu e=new Encapsu();
		e.setaccname("Krishna");
		//e.setaccno(12345);
		e.setbalance(5000);
		
		System.out.println(e.getaccno());
		System.out.println(e.getbalance());
		System.out.println(e.getaccname());

	}

}
