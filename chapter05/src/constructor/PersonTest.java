package constructor;

public class PersonTest {

	public static void main(String[] args) {

		Person personKim = new Person();	// 디폴트 생성자
		// 디폴트 생성자로 인스턴스를 생성한 후 인스턴스 변수 값을 따로 초기화
		personKim.name = "김유신";
		personKim.height = 180.0F;
		personKim.weight = 85.5F;
		
		
		/*
		 * Q) Code by Myself
		 * 이름, 키, 몸무게를 매개변수로 받는 생성자 사용해 인스턴스 생성하기
		 */
		// 인스턴스 변수 초기화와 동시에 인스턴스 생성
		Person personLee = new Person("Aaron Lee", 174.5F, 65.0F);

	}

}
