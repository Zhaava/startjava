public class Jaeger {

	String modelName, mark, origin;
	float height, weight;
	int speed, strength;

	public Jaeger(String modelName, String mark, String origin,
		float height, float weight, int speed, int strength) {

		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
	}

	public Jaeger(String modelName, String mark, String origin) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
	}

	String getJaegerMark() {
		return modelName;
	}

	void move() {
		System.out.println(getJaegerMark() + " is moving");
	}

	void useVortexCannon() {
		System.out.println(getJaegerMark() + " is using vortex cannon");
	}
}