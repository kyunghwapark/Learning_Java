package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		/*
		 *  멤버 변수 접근제어자를 public으로 설정하면 외부 클래스에서 MyDate 사용 시 
		 *  이렇게 잘못 된 값을 오류 검증 없이 마음대로 넣을 수 있어서 문제 발생 가능
		 */
//		date.month = 2;
//		date.day = 31;
//		date.year = 2018;

	}

}
