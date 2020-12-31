package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int computerNumber;
	private Player player1;
	private Player player2;
	private static int attempt = 0;
	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void launch() {
		Random random = new Random();
		computerNumber = random.nextInt(100);

		System.out.println("Компьютер загадал " + computerNumber);
		System.out.println("у вас 10 попыток.");
		do {
			inputNumber(player1);
			player1.storage[attempt] = player1.getNumber();
			if (compareNumbers(player1)) {
				break;
			}
			inputNumber(player2);
			player2.storage[attempt] = player2.getNumber();
			attempt++;
			if (attempt == 10) {
				System.out.println("У игроков закончились попытки");
			}
		} while(!(compareNumbers(player2)) & !(attempt == 10));
		attempt = 0;
		System.out.println("Числа которые ввел " + player1.getName());
		for (int num : player1.storage) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Числа которые ввел " + player2.getName());
		for (int num : player2.storage) {
			System.out.print(num + " ");
		}
		System.out.println();
		Arrays.fill(player1.storage,0);
		Arrays.fill(player2.storage,0);
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
			System.out.println(result);
			return true;
		}
		result = "Число " + (player.getNumber() > computerNumber ? "больше" : "меньше") + " того, что загадал компьютер";
		System.out.println(result);
		return false;
	}
}
