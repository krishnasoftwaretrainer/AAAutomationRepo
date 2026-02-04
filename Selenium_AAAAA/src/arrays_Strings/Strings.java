package arrays_Strings;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String s4="Hello World"; //4bytes 123
		System.out.println(s4);
		String s5="Hello World";  //123 456
		System.out.println(s5);
		String s6="Hello World"; //123
		System.out.println(s6);
		
		/*
		//Literal String & new Keyword
		System.out.println("Enter your Name:");
		//String name=sc.nextLine();
		String name=sc.next();
		System.out.println(name);
		*/
		
		String s2=new String("Hello World"); //123
		System.out.println(s2);
		String s3=new String("hello World1"); //456
		System.out.println(s3);
		
		//System.out.println(s2==s3); //F
		//System.out.println(s4==s5); //T
		
		System.out.println(s2.equals(s3)); //T
		System.out.println(s4.equals(s5)); //T
		
		System.out.println(s2.equalsIgnoreCase(s3)); //T
		System.out.println(s4.equalsIgnoreCase(s5)); //T
		
	}

}
