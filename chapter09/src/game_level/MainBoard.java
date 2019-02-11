package game_level;

public class MainBoard {

	public static void main(String[] args) {
		
		// 처음 생성하면 BeginnerLevel
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);	// 이 때 매개변수의 자료형 : PlayerLevel
//		player.upgradeLevel(new AdvancedLevel());
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);	// 이 때 매개변수의 자료형 : PlayerLevel
//		player.upgradeLevel(new SuperLevel());
		player.play(3);

	}

}
