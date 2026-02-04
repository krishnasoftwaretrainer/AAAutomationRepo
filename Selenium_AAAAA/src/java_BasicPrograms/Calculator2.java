package java_BasicPrograms;

import methods.Calculator;

public class Calculator2 {

	public static void main(String[] args) {
		Calculator.Addition();  //Static Method Calling
		
		
		Calculator calc = new Calculator();  //Object Creation
		calc.Subtraction(50, 20);
		int subResult = Calculator.Multiplication();
		System.out.println("Multification is: " + subResult);
		int divResult = calc.Division(100, 20);
		System.out.println("Division is: " + divResult);
		
	}

}
