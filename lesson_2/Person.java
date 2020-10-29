public class Person {
	
	char sex = 'm';
	String name = "Ivan";
	float height = 1.83f;
	int weight = 74;
	int age = 42;

	void move() {
		System.out.println("Вы прошли 10 метров");
	}

	boolean sit() {
		System.out.println("Вы сели");
		return true;
	}

	void run() {
		System.out.println("Вы пробежали 10 метров");
	}

	String speak() {
		return "Привет";
	}

	boolean studyJava() {
		System.out.println("Вы начали учить Java");
		return true;
	}
}