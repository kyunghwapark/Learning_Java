package data_type;

public class CharacterEx1 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);			// 문자 출력
		System.out.println((int)ch1);		// 문자에 해당하는 정수값(아스키 코드 값) 출력

		char ch2 = 66;						// 정수 값 대입
		System.out.println(ch2);			// 정수 값에 해당하는 문자 출력
		
		int ch3 = 67;
		System.out.println(ch3);			// 문자 정수 값 출력
		System.out.println((char)ch3);		// 정수 값에 해당하는 문자 출력
		
		
		// 1분 복습
		System.out.println();
		char ch4 = 'Z';
		System.out.println((int)ch4);		// 대문자 Z에 해당하는 정수값 출력
		
		char ch5 = 38;
		System.out.println(ch5);			// 아스키코드 38에 해당하는 문자 출력
		
		int ch6 = 97;
		System.out.println((char)ch6);		// 아스키코드 97에 해당하는 문자 출력
	}
}
