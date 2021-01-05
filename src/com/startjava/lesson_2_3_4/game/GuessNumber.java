package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int computerNumber;
	private Player player1;
	private Player player2;
	private int attempt;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void launch() {
		Random random = new Random();
		computerNumber = random.nextInt(101);

		System.out.println("Компьютер загадал " + computerNumber);
		System.out.println("у вас 10 попыток.");
		do {
			player1.setEnteredNumber(attempt, inputNumber(player1));
			if (compareNumbers(player1)) {
				break;
			}
			player2.setEnteredNumber(attempt, inputNumber(player2));
			if (compareNumbers(player2)) {
				break;
			}
			attempt++;
			if (attempt == 10) {
				System.out.println("У игроков закончились попытки");
			}
		} while(!(attempt == 10));

		attempt = 0;
		playerOutputNumbers(player1);
		playerOutputNumbers(player2);
		Arrays.fill(player1.getEnteredNumbers(),0);
		Arrays.fill(player2.getEnteredNumbers(),0);
	}

	private int inputNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.println(player.getName() + " вводит число");
		return scan.nextInt();
	}

	private boolean compareNumbers(Player player) {
		if (player.getEnteredNumbers()[attempt] == computerNumber) {
			System.out.println(player.getName() + " победил!");
			return true;
		}
		System.out.println("Число " +
				(player.getEnteredNumbers()[attempt] > computerNumber ? "больше" : "меньше")
				+ " того, что загадал компьютер");
		return false;
	}

	private void playerOutputNumbers(Player player) {
		System.out.println("Числа которые ввел " + player.getName());
		for (int num : player.getEnteredNumbers()) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
