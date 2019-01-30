package exercise.Q7;

/*
 * 싱글톤 패턴 사용해서 카드 번호 자동 생성
 */

public class CardTest {

	public static void main(String[] args) {
		
		CardCompany card1 = CardCompany.getInstance();
		CardCompany card2 = CardCompany.getInstance();
		CardCompany card3 = CardCompany.getInstance();
		CardCompany card4 = CardCompany.getInstance();
		
		System.out.println(card1.getCardNumber());
		System.out.println(card2.getCardNumber());
		System.out.println(card3.getCardNumber());
		System.out.println(card4.getCardNumber());
	}

}
