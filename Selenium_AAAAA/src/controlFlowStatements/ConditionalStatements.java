package controlFlowStatements;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// simple-if()

		int marks = 40;
		/*
		 * if(marks>=40) //Simple-if { System.out.println("Student is Passed"); }
		 */

		/*
		 * if(marks>=40) //if-else { System.out.println("Student is Passed"); } else {
		 * System.out.println("Student is Failed"); }
		 */
		/*
		 * System.out.println("Enter your OTP:"); int otp=sc.nextInt();
		 * 
		 * if(otp==1234) //if-else-if ladder { System.out.println("Login Successful"); }
		 * else { System.out.println("Login Failed"); }
		 */

		/*
		 * System.out.println("Enter your UserName:"); String username=sc.next();
		 * System.out.println("Enter your Password:"); String password=sc.next();
		 * 
		 * //if(username.equals("standard_user") && password.equals("secret_sauce"))
		 * //nested-if if(username.equalsIgnoreCase("standard_user")&&
		 * password.equalsIgnoreCase("secret_sauce")) {
		 * 
		 * System.out.println("Login Successful"); } else {
		 * System.out.println("UserName or Password is incorrect"); }
		 */
		/*
		System.out.println("Enter your UserName:");
		String username = sc.next();
		System.out.println("Enter your Password:");
		String password = sc.next();

		if (username.equalsIgnoreCase("standard_user") && password.equalsIgnoreCase("secret_sauce")) {

			System.out.println("standard_user Login Successful");
		}

		else if (username.equalsIgnoreCase("locked_out_user") && password.equalsIgnoreCase("secret_sauce")) {

			System.out.println("Epic sadface: Sorry, this user has been locked out.");
		} 
		else if (username.equalsIgnoreCase("problem_user") && password.equalsIgnoreCase("secret_sauce")) {

			System.out.println("problem_user Login Successful");
		} 
		else if (username.equalsIgnoreCase("performance_glitch_user") && password.equalsIgnoreCase("secret_sauce")) {

			System.out.println("performance_glitch_user Login Successful");
		} 
		
		else 
		{
			System.out.println("UserName or Password is incorrect");
		}
		*/
		//Nested-if()
		/*
		System.out.println("Enter your UserName:");
		String username = sc.next();
		System.out.println("Enter your Password:");
		String password = sc.next();
		
		if(username.equalsIgnoreCase("standard_user") ) //T F
		{
			if(password.equalsIgnoreCase("secret_sauce")) //T F
			{
				System.out.println("standard_user Login Successful");
			}
						
			else //Inner Condition:F
			{
				System.out.println("Password is incorrect");
			}
		}
			else //Outer Condition: F
			{
				System.out.println("UserName is incorrect");
			}
		*/
		
		//Calaculator using switch-case
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the operator (+, -, *, /):");
		char operator = sc.next().charAt(0);
		
		switch(operator)
		{
		case '+':
		{
			System.out.println("Addition: " + (num1 + num2));
			break;
		}
		case '-':
		
			System.out.println("Subtraction: " + (num1 - num2));
			break;
			
		case '*':
		
			System.out.println("Multiplication: " + (num1 * num2));
			break;
			
			case '/':
				System.out.println("Division: " + (num1 / num2));
				break;
				default: //insted of else 
					System.out.println("Invalid operator!");
			
			
	}
	
		
			
		sc.close();

	}

}
