package constant;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;		// 선언과 동시에 초기화
		final int MIN_NUM;				// 일단 선언한 후, 추후 초기화
		
		MIN_NUM = 0;					// 사용하기 전에 초기화. 초기화하지 않고 사용하면 오류 발생 
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
//		MAX_NUM = 1000;					// 오류 발생. 상수는 한 번 대입한 값을 변경할 수 없음.
		
		
		// 1분 복습
		final int MY_AGE = 33;
		System.out.println(MY_AGE);
	}

}
