package com.startjava.lesson_2_3.calculator;
public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private char mathOperation;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void setMathOperation(char mathOperation) {
		this.mathOperation = mathOperation;
	}

	public void calculate() {
		switch(mathOperation) {
			case '+':
				System.out.println(firstNumber + secondNumber);
				break;
			case '-':
				System.out.println(firstNumber - secondNumber);
				break;
			case '*':
				System.out.println(firstNumber * secondNumber);
				break;
			case '/':
				System.out.println(firstNumber / secondNumber);
				break;
			case '^':
				System.out.println(Math.pow(firstNumber, secondNumber));
				break;
			case '%':
				System.out.println(firstNumber % secondNumber);
				break;
			default:
				System.out.println("Error");
		}
	}
}