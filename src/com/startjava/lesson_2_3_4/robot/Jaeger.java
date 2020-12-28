package com.startjava.lesson_2_3_4.robot;
public class Jaeger {

	private String modelName;
	private String mark ; 
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;

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

	String getModelName() {
		return modelName;
	}
	
	void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	String getMark() {
		return mark;
	}
	
	void setMark(String mark) {
		this.mark = mark;
	}

	String getOrigin() {
		return origin;
	}
	
	void setOrigin(String origin) {
		this.origin = origin;
	}
	
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void move(String modelName) {
		System.out.println(modelName + " is moving");
	}

	void useVortexCannon(String modelName) {
		System.out.println(modelName + " is using vortex cannon");
	}
}