package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan=2; dan<=9; dan++) {				// 2단부터 9단까지 반복하는 외부 반복문
			System.out.println("< " + dan + "단 >");
			
			for(times=1; times<=9; times++) {	// 각 단에서 1~9를 곱하는 내부 반복문
				System.out.println(dan + " x " + times + " = " + dan * times);
			}
			
			System.out.println(); 				// 한 줄 띄어서 출력
		}
		
		
		// 1분 복습 : 3단~7단까지만 출력하기
		System.out.println("<< 1분 복습 >>");
		System.out.println();
		for(dan=3; dan<=7; dan++) {
			System.out.println("< " + dan + "단 >");
			
			for(times=1; times<=9; times++) {
				System.out.println(dan + " x " + times + " = " + dan*times);
			}
			
			System.out.println();
		}
	}
}
