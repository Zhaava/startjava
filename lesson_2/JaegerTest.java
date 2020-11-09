public class JaegerTest {
	public static void main(String[] args) {
		Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia");
		Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia");
		Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA");

		chernoAlpha.move();
		strikerEureka.move();
		gipsyDanger.move();

		chernoAlpha.useVortexCannon();
		strikerEureka.useVortexCannon();
		gipsyDanger.useVortexCannon();


	}
}