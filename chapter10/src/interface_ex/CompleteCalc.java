package interface_ex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public double divide(int num1, int num2) {
		if (num2 != 0) {
			return (double)num1 / num2;
		} else {
			return Calc.ERROR;
		}	
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	
	// Quiz) 나 혼자 코딩! : Calc 인터페이스에 새로운 메서드 추가하기
	@Override
	public int square(int num) {
		return num * num;
	}
	
	

}
