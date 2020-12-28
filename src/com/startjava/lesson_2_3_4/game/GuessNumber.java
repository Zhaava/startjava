package com.startjava.lesson_2_3_4.game;

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

	private void inputNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.println(player.getName() + " вводит число");
		player.setNumber(scan.nextInt());
	}

	private boolean compareNumbers(Player player) {
		String result;
		if (player.getNumber() == computerNumber) {
			result = player.getName() + " победил!";
			return true;
		}
		result = "Число " + (player.getNumber() > computerNumber ? "больше" : "меньше") + " того, что загадал компьютер";
		System.out.println(result);
		return false;
	}
}
