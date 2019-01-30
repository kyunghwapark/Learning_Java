package singleton;


/*
 *  Quiz) 나 혼자 코딩!
 *  싱글톤 패턴으로 클래스 구현 연습하기
 */

public class CarFactoryTest {

	public static void main(String[] args) {
		
		// 싱글톤 패턴 인스턴스 획득
		CarFactory factory = CarFactory.getInstance();
		
		// 메서드에서 Car 생성
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNumber());
		System.out.println(yourSonata.getCarNumber());

	}

}
