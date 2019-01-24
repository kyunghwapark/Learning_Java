package data_type;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C';		// 문자 '한'의 유니코드 값 (16진수, 4bit 4개 = 16bit = 2byte)
		
		System.out.println(ch1);
		System.out.println(ch2);
	}
}
