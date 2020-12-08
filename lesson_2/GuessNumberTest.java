import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите имя первого игрока");
		Player player1 = new Player(scan.nextLine());

		System.out.println("Введите имя второго игрока");
		Player player2 = new Player(scan.nextLine());
		
		GuessNumber game = new GuessNumber(player1, player2);

		String exit = "";
		while(!exit.equals("нет")) {
			game.launch();
			do {
				System.out.println("Хотите продолжить? [да/нет]:");
				exit = scan.nextLine();
			} while (!exit.equals("да") && !exit.equals("нет"));
		}
	}
}
