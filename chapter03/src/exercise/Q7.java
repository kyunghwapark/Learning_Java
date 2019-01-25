package exercise;

public class Q7 {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 20;
		
		int result = (num >= 10) ? num2 + 10 : num2 - 10;	// 조건식이 참이므로 result = num2 + 10 = 30
		System.out.println(result);
	}
}
