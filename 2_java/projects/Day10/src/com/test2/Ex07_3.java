package com.test2;

interface Vehicle {
	public static final int NUM = 100;
	
	public abstract void speed();
	
	public default void start() {
		System.out.println("start()");
	}
	
	public static void stop() {
		System.out.println("stop()");
	}
	
	// public void e() {}
	// 일반 메소드 정의 불가
}

class Car implements Vehicle {
	@Override
	public void speed() {
		System.out.println("100km");
	}
}

public class Ex07_3 {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.speed();
		System.out.println(Vehicle.NUM);
		Vehicle.stop();
	}

}
