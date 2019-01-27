package classpart;

public class CodeByMyself1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int totalAdd = add(num1, num2); 				// add() 함수 호출
		System.out.println(num1 + " + " + num2 + " = " + totalAdd + " 입니다.");

		int totalSub = sub(num1, num2);				// sub() 함수 호출
		System.out.println(num1 + " - " + num2 + " = " + totalSub + " 입니다.");

		int totalMulti = multi(num1, num2);			// multi() 함수 호출
		System.out.println(num1 + " x " + num2 + " = " + totalMulti + " 입니다.");

		double totalDiv = div(num1, num2);			// div() 함수 호출
		System.out.println(num1 + " ÷ " + num2 + " = " + totalDiv + " 입니다.");
		
		
		FunctionTest func = new FunctionTest();
		func.divide(num1, num2);
	}

	public static int add(int n1, int n2) { 		// 덧셈 : add()함수
		int result;
		result = n1 + n2;
		return result; // 결과 값 반환
	}

	public static int sub(int n1, int n2) { 		// 뺄셈 : sub() 함수
		int result = n1 - n2;
		return result;
	}

	public static int multi(int n1, int n2) { 		// 곱셈 : multi() 함수
		int result = n1 * n2;
		return result;
	}

	public static double div(double n1, double n2) { // 나눗셈 : div() 함수
		double result = n1 / n2;
		return result;
	}
}
