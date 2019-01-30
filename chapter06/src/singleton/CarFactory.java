package singleton;


/*
 *  Quiz) 나 혼자 코딩!
 *  싱글톤 패턴으로 클래스 구현 연습하기
 */

public class CarFactory {
	
	// 생성자
	private CarFactory() {}
	
	// 유일한 인스턴스 생성
	private static CarFactory instance = new CarFactory();
	
	// 유일한 인스턴스를 return하는 getter
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
}
