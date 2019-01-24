package operator;

public class OperationEx4 {

	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch); 		// F (false)
		
		
		// 1분 복습
		int num = 10;
		boolean isEven;
		
		isEven = ((num % 2) == 0) ? true : false;
		System.out.println(isEven);
	}

}
