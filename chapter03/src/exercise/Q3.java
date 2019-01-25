package exercise;

public class Q3 {

	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(num); 		// 10
		System.out.println(num++); 		// 10		-> 현재의 num 출력 후 1 증가 : num = 11
		System.out.println(num); 		// 11
		System.out.println(--num); 		// 10		-> num에서 1 감소시킨 후 출력 : num = 10
	}

}
