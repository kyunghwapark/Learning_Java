package loopexample;

public class BreakExample2 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
				 
//		종료 조건을 for문 안에 사용(조건식)하면 num 값을 늘리는 증감식을 먼저 수행하므로
//		조건을 만족하는 순간의 정확한 num값을 구할 수 없다.
//		따라서 프로그램 실행 중에 반복문을 중단하려면 break문을 사용할 것!
		
		for (num=0; ; num++) {
			sum += num;
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("합이 100이 넘는 num : " + num);
		System.out.println("그 때의 합 sum : " + sum);


		// 1분 복습 : 1부터 더했을 때 그 합이 500을 넘는 자연수
		for(num=1; ; num++) {
			sum += num;
			if(sum >= 500) {
				break;
			}
		}
		System.out.println(sum);
		System.out.println(num);

	}

}
