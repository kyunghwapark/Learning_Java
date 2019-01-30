package exercise.Q6;

/*
 * 카드 번호 자동 생성
 */

public class Card {
	
	private static int serialNum;
	private int cardNumber;
	
	public Card() {
		serialNum++;
		cardNumber = serialNum;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
}
