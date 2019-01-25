package loopexample;

public class BasicLoop {

	public static void main(String[] args) {
		int num = 1;
		
		num += 2;		// 1+2
		num += 3;		// 1+2+3
		num += 4;		// 1+2+3+4
		num += 5;		// 1+2+3+4+5
		num += 6;		// 1+2+3+4+5+6
		num += 7;		// 1+2+3+4+5+6+7
		num += 8;		// 1+2+3+4+5+6+7+8
		num += 9;		// 1+2+3+4+5+6+7+8+9
		num += 10;		// 1+2+3+4+5+6+7+8+9+10
		
		System.out.println("1부터 10까지의 합은 " + num + "입니다.");

	}

}
