package arrays_Strings;

import java.util.Scanner;

public class DoubelDimensionArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int marks[][]= {{85,90,78},  //Student 1
						{76,88,91},  //Student 2
						{69,72,80}   //Student 3
						};
		
		
		for(int i=0;i<marks.length;i++) //rows
		{
			for(int j=0;j<marks[i].length;j++) //columns
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		} */
		
		System.out.println("Enter Row Size:");
		int row=sc.nextInt();
		System.out.println("Enter Column Size:");
		int col=sc.nextInt();
		
		int marks[][]=new int[row][col]; //2rows 3columns
	
	System.out.println("Enter Marks of Students:");
	
	for(int i=0;i<row;i++) //rows
	{
		for(int j=0;j<col;j++) //columns
		{
			marks[i][j]=sc.nextInt();
		}
	}
	System.out.println("Given Marks are:");
	
	//for(int i=0;i<row;i++) //rows
	for(int i=0;i<marks.length;i++) //rows
	{
		//for(int j=0;j<col;j++) //columns
		for(int j=0;j<marks[i].length;j++) //columns
		{
			System.out.print(marks[i][j]+" ");
		}
		System.out.println();
	
	//int c=a+b;
	//int c[][]=a[][]+b[][];
	}
	}

}
