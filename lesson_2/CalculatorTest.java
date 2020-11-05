import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String exit = "";
		while(!exit.equals("нет")) {
			System.out.print("Введите первое число: ");
			Scanner scan = new Scanner(System.in);
			int firstNumber = scan.nextInt();

			System.out.print("Введите знак математической операции: ");
			char mathSign = scan.next().charAt(0);

			System.out.print("Введите второе число: ");
			int secondNumber = scan.nextInt();

			System.out.println(firstNumber + " " + mathSign + " " + secondNumber + " = " + 
				Calculator.calculate(firstNumber, secondNumber, mathSign));

			do {
				System.out.println("Хотите продолжить? [да/нет]:");
				exit = scan.nextLine();
			} while (!exit.equals("да") && !exit.equals("нет"));
		}
	}
}