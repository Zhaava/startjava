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
		

		Random random = new Random();
		computerNumber = random.nextInt(100);
		System.out.println("Компьютер загадал " + computerNumber);

		do {
			inputNumber(player1);
			if (compareNumbers(player1)) {
				break;
			}
			inputNumber(player2);
		} while(!compareNumbers(player2));
	}

	private boolean compareNumbers(Player player) {
		String num = player.getNumber() > computerNumber ? "Число больше того, что загадал компьютер" :
			player.getNumber() < computerNumber ? " меньше того, что загадал компьютер" :" победил!!!";
		System.out.println(num);
		return player.getNumber() != computerNumber ? false:true;
	}

	public void inputNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.println(player.getName() + " вводит число");
		player.setNumber(scan.nextInt());
	}
}



	// private boolean compareNumbers(Player player) {
	// 	if(player.getNumber() > computerNumber) {
	// 		System.out.println("Число " + player.getName() + " больше того, что загадал компьютер");
	// 	} else if(player.getNumber() < computerNumber) {
	// 		System.out.println("Число " + player.getName() + " меньше того, что загадал компьютер");
	// 	} else {
	// 		System.out.println(player.getName() + " победил!!!");
	// 		return true;
	// 	}
	// 	return false;
	// }
