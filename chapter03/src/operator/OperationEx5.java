package operator;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B00000101;		// 5를 8비트 2진수로 나타냄
		
		System.out.println(num << 2);		// 0B00010100 = 20
		System.out.println(num >> 2); 		// 0B00000001 = 1
		System.out.println(num >>> 2); 		// 0B00000001 = 1
		
		System.out.println(num);			// num에 값을 대입하지 않았으므로 상기 비트 이동과 관계없이 기존 값 그대로 출력
		
		num = num << 2;						// 0B00010100 = 20
		System.out.println(num);
	}

}
