package interface_ex;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;

		Calc calc = new CompleteCalc();
		System.out.println("===== 사칙연산 계산기 =====");
		System.out.println("num1 + num2 = " + calc.add(num1, num2));
		System.out.println("num1 - num2 = " + calc.substract(num1, num2));
		System.out.println("num1 * num2 = " + calc.times(num1, num2));
		System.out.println("num1 / num2 = " + calc.divide(num1, num2));
		// Quiz) 나 혼자 코딩! : Calc 인터페이스에 새로운 메서드 추가하기
		System.out.println("num1 의 제곱 = " + calc.square(num1));

		System.out.println();
		
		if (calc instanceof CompleteCalc) {
			CompleteCalc cCalc = (CompleteCalc) calc;
			cCalc.showInfo();
		} else {
			System.out.println("정보를 출력할 수 없습니다.");
		}

	}
}
