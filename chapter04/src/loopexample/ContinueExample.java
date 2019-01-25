package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num=1; num<=100; num++) {	// 100까지 반복
			if(num % 2 == 0) {		// num 값이 짝수인 경우
				continue;			// 이후 수행을 생략하고 증감식(num++) 수행
			} else {				// num 값이 홀수인 경우에만 수행
				total += num;
			}
		}
		
		System.out.println("1부터 100까지 홀수의 합은 : " + total + "입니다.");
		System.out.println();
		
		
		// 1분 복습
		System.out.print("(방법1) 3의 배수 : ");
		
		for(num=1; num<=100; num++) {
			if(num % 3 == 0) {
				System.out.print(num + " ");
			} else {
				continue;
			}
		}
		
		System.out.println();
		System.out.print("(방법2) 3의 배수 : ");
		for(num=1; num<=100; num++) {
			if(num % 3 != 0) {
				continue;
			}
			System.out.print(num + " ");
		}
	}
}
