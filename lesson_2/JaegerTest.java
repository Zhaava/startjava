public class JaegerTest {
	public static void main(String[] args) {
		Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia");
		Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia");
		Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA");

		chernoAlpha.setSpeed(40);
		System.out.println("Alpha speed is: " + chernoAlpha.getSpeed());
		chernoAlpha.setSpeed(60);
		System.out.println("Alpha new speed is: " + chernoAlpha.getSpeed());

		chernoAlpha.move(chernoAlpha.getModelName());
		strikerEureka.move(strikerEureka.getModelName());
		gipsyDanger.move(gipsyDanger.getModelName());

		chernoAlpha.useVortexCannon(chernoAlpha.getModelName());
		strikerEureka.useVortexCannon(strikerEureka.getModelName());
		gipsyDanger.useVortexCannon(gipsyDanger.getModelName());
	}
}