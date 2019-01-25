package ifexample;

import java.util.Scanner;

public class CodeByMyself1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		int score = scanner.nextInt();
		char grade;
		
		if (score <= 100 && score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("당신의 학점은 " + grade + " 입니다.");
		
		scanner.close();
		
		
		// 1분 복습
		// 간단한 if-else 조건문의 경우, 삼항연산자를 사용해 표현할 수도 있다. 단, 가독성 측면에서 if-else를 사용하는 것이 더 좋다.
		grade = (score >= 90) ? 'A' : 'B';
		System.out.println(grade);
	}
}
