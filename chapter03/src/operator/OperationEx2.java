package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		int gameScore = 150;				// 게임에서 획득한 점수는 150점
		
		int lastScore1 = ++gameScore;		// gameScore에 1만큼 더한 값을 lastScore1에 대입
		System.out.println(lastScore1);		// 즉, ++gameScore = 151 = lastScore1
		
		int lastScore2 = --gameScore;		// gameScore에 1만큼 뺀 값을 lastScore2에 대입
		System.out.println(lastScore2);		// 즉, --gameScore = 150 = lastScore2
		
		
		// 1분 복습
		int lastScore3 = gameScore++;						// gameScore의 현재 값을 lastScore3에 대입한 후 gameScore에 1만큼 더함
		System.out.println("lastScore = " + lastScore3);	// 즉, gameScore = 150 = lastScore3  => gameScore++ = 151
		System.out.println("gameScore = " + gameScore);
		
		int lastScore4 = gameScore--;						// gameScore의 현재 값을 lastScore4에 대입한 후 gameScore에 1만큼 뺌
		System.out.println("lastScore = " + lastScore4);	// 즉, gameScore = 151 = lastScore4  => gameScore-- = 150
		System.out.println("gameScore = " + gameScore);
	}

}
