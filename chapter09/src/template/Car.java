package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메서드 (template method)
	// 역할 : 메서드 실행 순서와 시나리오를 정의함
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
