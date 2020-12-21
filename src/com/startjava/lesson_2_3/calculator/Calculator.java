package com.startjava.lesson_2_3.calculator;
public class Calculator {
	public static int calculate(int firstNumber, int secondNumber, char mathSign) {
		switch(mathSign) {
			case '+':
				return firstNumber + secondNumber;
			case '-':
				return firstNumber - secondNumber;
			case '*':
				return firstNumber * secondNumber;
			case '/':
				return firstNumber / secondNumber;
			case '^': {
				int result = 1;
				for (int i = 0; i < secondNumber; i++) {
					result *= firstNumber;
				}
				return result;
			}
			case '%':
				return firstNumber % secondNumber;
			default:
				return 0;
		}
	} 
}
