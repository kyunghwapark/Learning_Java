package cooperation;

public class Subway {
	
	String lineNumber;			// 지하철 노선
	int passengerCount;			// 승객 수
	int money;					// 수입액
	
	public Subway(String lineNumber) {	// 지하철 노선 번호를 매개변수로 받는 생성자
		this.lineNumber = lineNumber;
	}

	public void take(int money) {		// 승객 한 명이 지하철에 탄 경우를 구현한 메서드
		this.money += money;	// 수입 증가
		passengerCount++;		// 승객 수 증가
	}
	
	public void showInfo() {
		System.out.println(
				"지하철 " + lineNumber + "의 승객은 " + passengerCount + "명이고, "
						+ "수입은 " + money + "원 입니다.");
	}
}
