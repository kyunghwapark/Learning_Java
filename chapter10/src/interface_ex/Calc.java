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
	int square(int num);	// Quiz) 나 혼자 코딩! : Calc 인터페이스에 새로운 메서드 추가하기
	
	
	// 인터페이스에서 body를 구현하는 디폴트 메서드
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		
		// 디폴트 메서드에서 private 메서드 호출해서 사용
//		myMethod();
	}
	
	// 인터페이스 이름으로 직접 참조하여 사용 가능한 정적 메서드 구현
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		// static 메서드에서 private static 메서드 호출해서 사용
//		myStaticMethod();
		
		return total;		
	}
	
	
	
//	cf)) private 메서드 : 자바 9부터 사용 가능
//	private void myMethod() {
//		System.out.println("private 메서드입니다.");
//	}
//	private static void myStaticMethod() {
//		System.out.println("private static 메서드입니다.");
//	}
}
