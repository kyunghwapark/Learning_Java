package loopexample;

public class BreakExample1 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;

		// 교재 예제
		/*
		 * Q) 0부터 시작해 숫자를 1씩 늘리면서 합을 계산할 때, 숫자를 몇까지 더해야 합이 100이 넘는지 구하시오.
		 * 
		 * 1부터 14까지 더해져서 sum이 105가 되었고(실행문) 
		 * for문의 특성상 증감식으로 가서 num++(num=15)가 된 후
		 * 조건식 sum<100 체크해 반복문 종료 
		 * 그래서 우리가 구하고자 하는 값인 14가 출력 안됨.
		 */

		for (num = 0; sum < 100; num++) {
			sum += num;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);

		
		
		// 내가 생각한 방식
		
		sum = 0;
		num = 0;
		while (true) {
			if (sum <= 100) {
				num++;
				sum += num;
			} else {
				break;
			}
		}
		System.out.println(num + "까지 더하면 합이 100이 넘는다. (합 = " + sum + ")");
	}
}
