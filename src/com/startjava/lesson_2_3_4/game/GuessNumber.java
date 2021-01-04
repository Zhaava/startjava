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
			inputNumber(player1);
			player1.setEnteredNumbers(attempt, player1.getNumber());
			if (compareNumbers(player1)) {
				break;
			}
			inputNumber(player2);
			player2.setEnteredNumbers(attempt, player2.getNumber());
			attempt++;
			if (attempt == 10) {
				System.out.println("У игроков закончились попытки");
			}
		} while(!(compareNumbers(player2)) & !(attempt == 10));
		attempt = 0;
		playerOutput(player1);
		playerOutput(player2);
		Arrays.fill(player1.getEnteredNumbers(),0);
		Arrays.fill(player2.getEnteredNumbers(),0);
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

	private void playerOutput(Player player){
		System.out.println("Числа которые ввел " + player.getName());
		for (int num : player.getEnteredNumbers()) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
