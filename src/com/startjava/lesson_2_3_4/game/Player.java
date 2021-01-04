package com.startjava.lesson_2_3_4.game;

public class Player {
	private String name;
	private int number;
	private int[] enteredNumbers = new int[10];


	public int[] getEnteredNumbers() {
		return enteredNumbers;
	}

	public void setEnteredNumbers(int index, int number) {
		this.enteredNumbers[index] = number;
	}



	public Player(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setNumber(int number) {
		this.number = number;
	}

	int getNumber() {
		return number;
	}
}
