package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String exit;
		do {
			System.out.print("Введите математическое выражение: ");
			String mathExpression = scan.nextLine();
			String[] arrExp = mathExpression.split(" ");

			calc.setFirstNumber(Integer.parseInt(arrExp[0]));

			calc.setMathOperation(arrExp[1].charAt(0));

			calc.setSecondNumber(Integer.parseInt(arrExp[2]));

			calc.calculate();
			do {
				System.out.println("Хотите продолжить? [да/нет]:");
				exit = scan.nextLine();
			} while (!exit.equals("да") && !exit.equals("нет"));
		} while(!exit.equals("нет"));
		System.out.println("Калькулятор закрылся.");
	}
}
