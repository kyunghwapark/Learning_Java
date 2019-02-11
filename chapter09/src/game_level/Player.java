package game_level;

public class Player {
	
	// Player 클래스와 PlayerLevel 클래스는 포함(HAS-A)관계
	private PlayerLevel level;
	
	// 디폴트 생성자 : 처음 생성되면 BeginnerLevel로 시작하며 레벨 메시지 출력
	public Player() {
		this.level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	// 레벨 변경 메서드
	// 매개변수 자료형은 모든 레벨로 변환 가능한 PlayerLevel
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		// PlayerLevel의 템플릿 메서드 go() 호출
		level.go(count);
	}
}
