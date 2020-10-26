public class MyFirstGame {
	public static void main(String[] args) {
		int playerNumber = 23, resultNumber = 43;

		while (playerNumber != resultNumber) {
			if (playerNumber > resultNumber) {
				System.out.println("Выведенное число больше того, что загадал компьютер");
				playerNumber--;
			} else if (playerNumber < resultNumber) {
				System.out.println("Выведенное число меньше того, что загадал компьютер");
				playerNumber++;
			}
		}
		System.out.println("Вы угадали");
	}
}