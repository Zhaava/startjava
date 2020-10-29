public class Wolf {

	char sex = 'M';
	String name = "Barsik";
	int weight = 20;
	int age = 10;
	String color = "White";

	void move() {
		System.out.println("Волк прошел 10 метров");
	}

	boolean sit() {
		System.out.println("Волк сел");
		return true;
	}

	void run() {
		System.out.println("Волк пробежал 10 метров");
	}

	boolean howl() {
		System.out.println("Волк лает");
		return true;
	}

	String hunt() {
		return "Волк поймал зайца";
	}
}