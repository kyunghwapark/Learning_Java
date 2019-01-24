package operator;

// 단락 회로 평가 (Short Circuit Evaluation : SCE)
public class OperationEx3 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		// 논리 곱에서 앞 항의 결과 값이 거짓이므로 뒷 항은 실행되지 않음 (논리 곱 : 두 항이 모두 참이어야 참)
		boolean value1 = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);	
		System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);		// 논리 곱에서 앞 항이 거짓이면 뒷 항이 실행되지 않아 i값은 초기값 그대로
		
		// 논리 합에서 앞 항의 결과 값이 참이므로 뒷 항은 실행되지 않음 (논리합 : 하나만 참이어도 참)
		value1 = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value1);
		System.out.println(num1);
		System.out.println(i);		// 논리 합에서 앞 항이 참이면 뒷 항이 실행되지 않아 i값은 초기값 그대로
		
		
		
		// 1분 복습
		int num = 5;
		int j = 10;
		
		// 논리 합에서 앞 항의 결과 값이 참이므로 뒷 항은 실행되지 않음
		boolean value = ((num = num * 10) > 45) || ((i = i - 5) < 10);
		System.out.println("1분 복습 value = " + value);		// true
		System.out.println("1분 복습 num = " + num);		// num = 50
		System.out.println("1분 복습 j = " + j);			// j = 10 (초기값 그대로)
	}
}
