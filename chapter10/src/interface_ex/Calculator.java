package interface_ex;

public abstract class Calculator implements Calc { // 추상클래스

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	// 디폴트 메서드 재정의 가능
	@Override
	public void description() {
		System.out.println("Calculator에서 재정의한 디폴트 메서드 입니다.");
	}

}
