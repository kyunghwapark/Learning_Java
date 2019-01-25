package exercise;

public class Q1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		// if-else if문을 사용해서 사칙 연산을 수행하는 프로그램 만들기
		if(operator == '+') {
			result = num1 + num2;
		} else if(operator == '-') {
			result = num1 - num2;
		} else if(operator == '*') {
			result = num1 * num2;
		} else if(operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("사칙 연산자가 아닙니다.");
		}
		
		System.out.println(operator + " 연산 결과는 " + result + "입니다.");
		
		
		
		
		// switch-case문을 사용해서 사칙 연산을 수행하는 프로그램 만들기
		operator = 'y';
		result = 0;
		
		switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			
			case '-':
				result = num1 - num2;
				break;
				
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("사칙 연산자가 아닙니다.");
				return;			// 이 경우 하단의 출력 실행문이 수행되지 않아야 하기 때문에 break가 아닌 return을 사용한다.
		}
		
		System.out.println(operator + " 연산 결과는 " + result + "입니다.");
	}
}
