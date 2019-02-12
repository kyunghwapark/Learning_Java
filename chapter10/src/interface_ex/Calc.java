package interface_ex;

public interface Calc {
	
	// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	double PI = 3.14;
	int ERROR = -999999999;
	
	// 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	double divide(int num1, int num2);
	
	// Quiz) 나 혼자 코딩! : Calc 인터페이스에 새로운 메서드 추가하기
	int square(int num);
}
