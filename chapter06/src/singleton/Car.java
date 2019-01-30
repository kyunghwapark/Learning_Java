package singleton;


/*
 *  Quiz) 나 혼자 코딩!
 *  싱글톤 패턴으로 클래스 구현 연습하기
 */

public class Car {
	
	private static int serialNum = 10000;
	
	// 멤버 변수 (field)
	private int carNumber;
	String carName;
	
	// 생성자
	public Car() {
		serialNum++;
		carNumber = serialNum;
	}
	
	public int getCarNumber() {
		return carNumber;
	}

}
