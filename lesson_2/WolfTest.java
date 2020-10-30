public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfBarsik = new Wolf();

		wolfBarsik.setSex('M');
		wolfBarsik.setName("Barbos");
		wolfBarsik.setWeight(15);
		wolfBarsik.setAge(5);
		wolfBarsik.setColor("White");
		System.out.println("Wolf sex = " + wolfBarsik.getSex());
		System.out.println("Wolf name = " + wolfBarsik.getName());
		System.out.println("Wolf weight = " + wolfBarsik.getWeight());
		System.out.println("Wolf age = " + wolfBarsik.getAge());
		System.out.println("Wolf color = " + wolfBarsik.getColor());

		// wolfBarsik.move();
		// wolfBarsik.sit();
		// wolfBarsik.run();
		// wolfBarsik.howl();
		// System.out.println(wolfBarsik.hunt());
	}
}