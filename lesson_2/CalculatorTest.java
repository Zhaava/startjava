import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		while(true) {
			System.out.print("Введите первое число: ");
			Scanner scan = new Scanner(System.in);
			int firstNumber = scan.nextInt();

			System.out.print("Введите знак математической операции: ");
			scan = new Scanner(System.in);
			char mathSign = scan.next().charAt(0);

			System.out.print("Введите второе число: ");
			scan = new Scanner(System.in);
			int secondNumber = scan.nextInt();

			System.out.println(firstNumber + " " + mathSign + 
								" " + secondNumber + " = " + 
								Calculator.count(firstNumber, 
									secondNumber, mathSign));

			String exit = "";

			do {
				System.out.println("Хотите продолжить? [да/нет]:");
				scan = new Scanner(System.in);
				exit = scan.nextLine();
				if (exit.equals("да")) break;
				if (exit.equals("нет")) break;
			} while (true);

			if (exit.equals("нет")) break;
		}
	}
}