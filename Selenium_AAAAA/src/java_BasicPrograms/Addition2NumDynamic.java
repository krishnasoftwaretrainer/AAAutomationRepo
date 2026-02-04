package java_BasicPrograms;

import java.util.Scanner;

public class Addition2NumDynamic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*
		System.out.print("Enter first number: ");
		int a=scan.nextInt();
		System.out.print("Enter second number: ");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("Addition: "+c);
		
		System.out.println("enter float num1: ");
		float f1=scan.nextFloat();
		System.out.println("enter float num2: ");
		float f2=scan.nextFloat();
		float f3=f1-f2;
		System.out.println("Addition of float: "+f3);
	
		
		System.out.println("enter boolean value1: ");
		boolean bool1=scan.nextBoolean();
		System.out.println(bool1);
		*/
		
		int a=10;
		float b=a;
		System.out.println("int to float: "+b);
		
		float f=12.33f;
		int c=(int) f;
		System.out.println("float to int: "+c);
	
		char d='A';
		int e=d;
		System.out.println("char to int: "+e);
		
		int g=65;
		char h=(char)g;
		System.out.println("int to char: "+h);
		
	}

}
