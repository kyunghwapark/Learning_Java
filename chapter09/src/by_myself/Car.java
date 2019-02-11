package by_myself;

public abstract class Car {
	// 추상 메서드
	abstract void run();
	abstract void refuel();
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
}
