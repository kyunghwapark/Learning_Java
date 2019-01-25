package ifexample;

import java.util.Scanner;

public class CodeByMyself2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("층을 입력하세요.");
		
		int floor = scanner.nextInt();

		switch(floor) {
			case 1:
				System.out.println("1층 약국입니다.");
				break;
			case 2:
				System.out.println("2층 정형외과입니다.");
				break;
			case 3:
				System.out.println("3층 피부과입니다.");
				break;
			case 4:
				System.out.println("4층 치과입니다.");
				break;
			case 5:
				System.out.println("5층 헬스클럽입니다.");
				break;
			default:
				System.out.println("이 건물은 5층 건물입니다. 확인 후 다시 입력하세요.");
				break;
		}
		
		scanner.close();
	}
}
