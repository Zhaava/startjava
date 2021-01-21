package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, GuessNumber.getAttempt() + 1);
    }

    public void setEnteredNumber(int index, int number) {
        enteredNumbers[index] = number;
    }
}
