package conversion;

public class ImplicitConversion {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;			// byte형 값이 int형 변수로 대입됨. 자료손실 없음
		
		System.out.println(bNum);
		System.out.println(iNum);	// int형으로 출력
		
		int iNum2 = 20;
		float fNum = iNum2;			// int형 값이 float형 변수로 대입됨. 자료손실 없음
		
		System.out.println(iNum);
		System.out.println(fNum);	// float형으로 출력
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);	// double형으로 출력
	}
}
