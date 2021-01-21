package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int hiddenNum;
    private Player player1;
    private Player player2;

    static private int attempt;

    public static int getAttempt() {
        return attempt;
    }

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Random random = new Random();
        hiddenNum = random.nextInt(101);

        System.out.println("Компьютер загадал " + hiddenNum);
        System.out.println("у вас 10 попыток.");
        do {
            inputNumber(player1);
            if (compareNumbers(player1)) {
                break;
            }
            inputNumber(player2);
            if (compareNumbers(player2)) {
                break;
            }
            attempt++;
            if (attempt == 10) {
                System.out.println("У игроков закончились попытки");
                break;
            }
        } while (true);

        showPlayerNumbers(player1);
        showPlayerNumbers(player2);
        attempt = 0;
        Arrays.fill(player1.getEnteredNumbers(), 0);
        Arrays.fill(player2.getEnteredNumbers(), 0);
    }

    private void inputNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.println(player.getName() + " вводит число");
        player.setEnteredNumber(attempt, scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getEnteredNumbers()[attempt] == hiddenNum) {
            System.out.println(player.getName() + " победил!");
            return true;
        }
        String result = player.getEnteredNumbers()[attempt] > hiddenNum ? "больше" : "меньше";
        System.out.println("Число " + result + " того, что загадал компьютер");
        return false;
    }

    private void showPlayerNumbers(Player player) {
        System.out.println("Числа которые ввел " + player.getName());
        for (int number : player.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
