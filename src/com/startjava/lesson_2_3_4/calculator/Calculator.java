package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private char mathOperation;

	public Calculator(String mathExpression) {
		String[] arrExp = mathExpression.split(" ");
		firstNumber = Integer.parseInt(arrExp[0]);
		mathOperation = arrExp[1].charAt(0);
		secondNumber = Integer.parseInt(arrExp[2]);
	}

	public int calculate() {
		switch(mathOperation) {
			case '+':
				return firstNumber + secondNumber;
			case '-':
				return firstNumber - secondNumber;
			case '*':
				return firstNumber * secondNumber;
			case '/':
				return firstNumber / secondNumber;
			case '^':
				return (int) Math.pow(firstNumber, secondNumber);
			case '%':
				return firstNumber % secondNumber;
			default:
				System.out.println("Error!");
				return 0;
		}
	}
}
