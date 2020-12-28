package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String exit;
		do {
			System.out.print("Введите математическое выражение: ");
			Calculator calc = new Calculator(scan.nextLine());

			System.out.println(calc.calculate());
			do {
				System.out.println("Хотите продолжить? [да/нет]:");
				exit = scan.nextLine();
			} while (!exit.equals("да") && !exit.equals("нет"));
		} while(!exit.equals("нет"));
		System.out.println("Калькулятор закрылся.");
	}
}
