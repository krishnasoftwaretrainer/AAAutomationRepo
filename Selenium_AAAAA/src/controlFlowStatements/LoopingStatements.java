package controlFlowStatements;

import java.util.Scanner;

public class LoopingStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//for(int i=5;i<=15;i++) 
		//for(int i=15;i>=5;i--)
		//for(int i=5;i<=15;i=i+3) //i+=3
		/*
		for(int i=15;i>=5;i-=2)//i=i-2
		{
			System.out.println(i);
		} */
		
		/*
		while(true)
		//for(int i=1;i<=5;i++)
		{
			System.out.println("Enter your Marks:");
			int marks=sc.nextInt();
			
		if(marks>=40) //if-else 
		{ 
			System.out.println("Student is Passed"); 
		}
		else
		{
		 System.out.println("Student is Failed"); }
		}	 
		*/
		
		int i=6;
		
		do
		{
			System.out.println(i);
			
		}while(i<=5);  //6<=5
	
	
		for(int j=6;j<=5;j++)  //6<=5
		{
			System.out.println(j);
		}
		
		int k=6;
		while(k<=5) //6<=5
		{
			System.out.println(k);
		
	}
	}
		
	}


