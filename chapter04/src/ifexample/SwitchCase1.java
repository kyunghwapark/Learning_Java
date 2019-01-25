package ifexample;

public class SwitchCase1 {

	public static void main(String[] args) {
		int ranking = 3;
		char medalColor;
		
		switch(ranking) {
			case 1 :			// 1등은 금메달 (Gold)
				medalColor = 'G';
				break;
			case 2 :			// 2등은 은메달 (Silver)
				medalColor = 'S';
				break;
			case 3 :			// 3등은 동메달 (Bronze)
				medalColor = 'B';
				break;
			default :			// 참가상은 A
				medalColor = 'A';
		}
		
		System.out.println(ranking + "등의 메달 색깔은 " + medalColor + " 입니다.");

	}

}
