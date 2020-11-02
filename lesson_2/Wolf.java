public class Wolf {

	private char sex = 'M';
	private String name = "Barsik";
	private int weight = 20;
	private int age = 10;
	private String color = "White";

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) System.out.println("Некорректный возраст");
		else this.age = age;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move() {
		System.out.println("Волк прошел 10 метров");
	}

	public boolean sit() {
		System.out.println("Волк сел");
		return true;
	}

	public void run() {
		System.out.println("Волк пробежал 10 метров");
	}

	public boolean howl() {
		System.out.println("Волк лает");
		return true;
	}

	public String hunt() {
		return "Волк поймал зайца";
	}
}