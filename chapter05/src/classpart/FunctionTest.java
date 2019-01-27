package classpart;

public class FunctionTest {

	// 매개 변수가 있는 함수 : 항(값) 두 개를 입력받아 더한 후 그 결과 값을 반환(return)하는 기능
	int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	
	// 매개 변수가 없는 함수 : 함수 내부에서 1부터 10까지 더한 후 그 결과 값을 반환하는 기능
	int getTenTotal() {
		int total = 0;
		
		for(int i=1; i<=10; i++) {
			total += i;
		}
		return total;
	}
	
	
	// 반환 값이 없는 함수 : 항(값) 두 개를 입력받아 나눈 후 그 결과 값을 바로 출력하는 기능
	void divide(double num1, double num2) {
		if(num2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return;				// 함수 수행 종료
		} else {
			System.out.println(num1 + " ÷ " + num2 + " = " + num1/num2 + " 입니다.");
		}
	}
}
