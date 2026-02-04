package arrays_Strings;

import java.util.Scanner;

public class SampleArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int htno[]= {101,102,103,104};
		
		for(int i=0;i<htno.length;i++) 
		{
			System.out.println(htno[i]);
		}  */
		
		//SR MC or MR SC 
		int htno[]=new int[3];
		
		System.out.println("Enter Arary Elements");
		
		for(int i=0;i<htno.length;i++) 
		{
			htno[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements are:");
		for(int i=0;i<htno.length;i++) 
		{
			System.out.print(htno[i]+" ");
		}
	}

}
