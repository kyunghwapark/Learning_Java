package exercise.Q6;

/*
 * 카드 번호 자동 생성
 */

public class CardTest {

	public static void main(String[] args) {

		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		
		System.out.println("첫 번째 발급된 카드 번호 : " + card1.getCardNumber());
		System.out.println("두 번째 발급된 카드 번호 : " + card2.getCardNumber());
		System.out.println("세 번째 발급된 카드 번호 : " + card3.getCardNumber());

	}

}
