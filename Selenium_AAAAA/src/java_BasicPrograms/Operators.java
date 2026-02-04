package java_BasicPrograms;

public class Operators {

	public static void main(String[] args) {
		
		/*
		int a=10;
		
		System.out.println(a+=5); //15 a=a+5; a=10+5=15
		System.out.println(a-=5); //a=a-5; a=15-5=10
		System.out.println(a*=5); //50 a=a*5; a=10*5=50
		System.out.println(a/=5); //10 a=a/5; a=50/5=10
		System.out.println(a%=5); //1 a=a%5; a=10%5=0
		
		int b=10,c=10,d=10,e=10,f=10;
		System.out.println(b+=5); //15
		System.out.println(c-=5); //5
		System.out.println(d*=5);  //50
		System.out.println(e/=5);  //2
		System.out.println(f%=5);  //0
		*/
		/*
		
		int a=5,b=5,c=5,d=5;
		
		System.out.println(++a); //6
		System.out.println(b++); //5 updated to 6 b=6
		                        
		System.out.println(--c); //4 updated to 4
		System.out.println(d--); //5 updated to 4 d=4
		*/
		
		//: ?
		/*
		int marks=75;
		
		boolean result = marks >= 35 ? true : false;
		String res=marks>=35 ? "Pass" :"Fail";
		
		System.out.println("Result: " + result);
		System.out.println("Result: " + res);
		*/
		
		/*
		int a=10,b=12;
		System.out.println(a&b); //12 
		System.out.println(a|b); //14
		System.out.println(a^b); //6
		*/
		//10 Binary = 1010 12 Binary = 1100  a&b:1000 covert to decimal=8
		// a|b:1110 covert to decimal=14
		// a^b:0110 covert to decimal=6
		
		int a=5; //Shift << 4times 5 Binary = 0101 after shifting Binary=01010000 =80
		System.out.println(a<<4); //80
		
		int b=80;
		//Right Shift >> 4times 80 Binary = 01010000 after shifting Binary=00000101 =5
		System.out.println(b>>4); //5
	
	}

}
