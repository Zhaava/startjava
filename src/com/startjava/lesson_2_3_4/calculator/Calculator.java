package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private char mathOperation;

	public Calculator() {
		Scanner scan = new Scanner(System.in);
		String mathExpression = scan.nextLine();
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
				return -1;
		}
	}
}
