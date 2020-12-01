import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int computerNumber;
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void launch() {
		Scanner scan = new Scanner(System.in);

		Random random = new Random();
		computerNumber = random.nextInt(100);
		System.out.println("Компьютер загадал " + computerNumber);

		while(true) {
			System.out.println(player1.getName() + " вводит число");
			player1.setNumber(scan.nextInt());

			if (compareNumbers(player1)) {
				break;
			}

			System.out.println(player2.getName() + " вводит число");
			player2.setNumber(scan.nextInt());

			if (compareNumbers(player2)) {
				break;
			}
		}
	}

	private boolean compareNumbers(Player player) {
		if(player.getNumber() > computerNumber) {
			System.out.println("Число " + player.getName() + " больше того, что загадал компьютер");
		} else if(player.getNumber() < computerNumber) {
			System.out.println("Число " + player.getName() + " меньше того, что загадал компьютер");
		} else {
			System.out.println(player.getName() + " победил!!!");
			return true;
		}
		return false;
	}
}
