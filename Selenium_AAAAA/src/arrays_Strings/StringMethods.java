package arrays_Strings;

public class StringMethods {

	public static void main(String[] args) {
		//String Methods
		//1.String length()
		String str="Hello World";
		System.out.println("Length of String: "+str.length());
		
		//2.String toUpperCase()
		
		System.out.println("Upper Case: "+str.toUpperCase());
				
		//3.String toLowerCase()
		System.out.println("Lower Case: "+str.toLowerCase());
		
		//4.String Concat()
		String str2="Welcome ";
		String str3="Java";
		String str4=str3.concat(str2);
		System.out.println("After Concat: "+str4);
		
		//5.String charAt()
		System.out.println("Character at 5th Index: "+str.charAt(4));
		
		//6.String Trim()
		String str5="   Hello Selenium   ";
		System.out.println("Before Trim: "+str5);
		System.out.println("After Trim: "+str5.trim());
		
		//7.String  Compare
		String s1="Hello";
		String s2="hello";
		System.out.println("Compare: "+s1.equals(s2));
		
		
	
	}

}
