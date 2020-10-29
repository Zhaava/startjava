public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfBarsik = new Wolf();

		System.out.println("Wolf sex = " + wolfBarsik.sex);
		System.out.println("Wolf name = " + wolfBarsik.name);
		System.out.println("Wolf weight = " + wolfBarsik.weight);
		System.out.println("Wolf age = " + wolfBarsik.age);
		System.out.println("Wolf color = " + wolfBarsik.color);

		wolfBarsik.move();
		wolfBarsik.sit();
		wolfBarsik.run();
		wolfBarsik.howl();
		System.out.println(wolfBarsik.hunt());
	}
}