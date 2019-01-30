package exercise.Q7;

/*
 * 싱글톤 패턴 사용해서 카드 번호 자동 생성
 */

public class CardCompany {
	
	private int cardNumber = 0;
	
	// 생성자
	private CardCompany() {}
	
	// 유일한 인스턴스
	private static CardCompany instance = new CardCompany();
	
	// 외부 클래스에서 접근 가능한 인스턴스 getter
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	public int getCardNumber() {
		cardNumber++;
		return cardNumber;
	}
}
