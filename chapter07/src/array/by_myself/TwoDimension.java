package array.by_myself;

/*
 * Quiz) 나 혼자 코딩!
 * 이차원 배열 연습하기
 */

public class TwoDimension {

	public static void main(String[] args) {
		
		char[][] smallLetter = new char[13][2];
		char ch = 'a';
		
		for(int i=0; i<smallLetter.length; i++) {
			for(int j=0; j<smallLetter[i].length; j++) {
				smallLetter[i][j] = ch;
				System.out.print(smallLetter[i][j] + " ");
				ch++;
			}
			System.out.println();
		}
	
	}

}
