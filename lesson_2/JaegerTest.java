public class JaegerTest {
	public static void main(String[] args) {
		Jaeger chernoAlpha = new Jaeger("unknown", "unknown", "unknown");
		Jaeger strikerEureka = new Jaeger("unknown", "unknown", "unknown");
		Jaeger gipsyDanger = new Jaeger("unknown", "unknown", "unknown");

		chernoAlpha.setJaegerModel("Cherno Alpha");
		chernoAlpha.setJaegerMark("Mark-1");
		chernoAlpha.setJaegerOrigin("Russia");

		strikerEureka.setJaegerModel("Striker Eureka");
		strikerEureka.setJaegerMark("Mark-5");
		strikerEureka.setJaegerOrigin("Australia");

		gipsyDanger.setJaegerModel("Gipsy Danger");
		gipsyDanger.setJaegerMark("Mark-3");
		gipsyDanger.setJaegerOrigin("USA");

		chernoAlpha.move(chernoAlpha.getJaegerModel());
		strikerEureka.move(strikerEureka.getJaegerModel());
		gipsyDanger.move(gipsyDanger.getJaegerModel());

		chernoAlpha.useVortexCannon(chernoAlpha.getJaegerModel());
		strikerEureka.useVortexCannon(strikerEureka.getJaegerModel());
		gipsyDanger.useVortexCannon(gipsyDanger.getJaegerModel());
	}
}