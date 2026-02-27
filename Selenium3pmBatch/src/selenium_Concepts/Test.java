package selenium_Concepts;

public class Test {

	public static void main(String[] args) {
	String s1="Hello";
	String s2="World";
	
	System.out.println(s1.concat(s2));
	System.out.println(s1+s2);
	System.out.println(s1.concat("World"));
	System.out.println(s1);
	
	StringBuilder sb=new StringBuilder("Hello");
	System.out.println(sb);
	sb.append("World");
	System.out.println(sb);
	
	System.out.println(sb.reverse());
	System.out.println(s1.contains("H"));
	
	String S10="Hello";
	//System.out.println(S10.reverse());
	
	String firstName = "Full Stack "; 
	String lastName = "Java"; 
	System.out.println(firstName.concat(lastName)); 
	System.out.println(firstName);
	System.out.println(lastName);
	
	String s11="I am good in Java"; 
	String replaceString=s11.replace('a','e');//replaces all occurrences of 'a' to 'e' 
	System.out.println(replaceString); 
	System.out.println(s11);
	
	StringBuilder sb1=new StringBuilder("I am good in Java");
	//sb1.replace('a','e');
	sb1.replace(0,6,"em");
	System.out.println(sb1);
	}

}
