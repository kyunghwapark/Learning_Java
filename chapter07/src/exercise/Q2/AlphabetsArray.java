package exercise.Q2;

public class AlphabetsArray {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		System.out.println("===== 배열 출력 =====");
		for (int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;		
			System.out.println(alphabets[i] + ", " + (char)(alphabets[i]+32));
			ch++;
		}
		
		System.out.println("=== 향상된 for문 ===");
		for(char capital : alphabets) {
			char small = (char)(capital+32);
			System.out.print(capital + ", ");	
			System.out.println(small);
		}
	}

}
