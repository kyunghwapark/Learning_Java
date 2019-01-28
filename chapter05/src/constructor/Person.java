package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	// Person 인스턴스 생성할 때 정의한 생성자들 중 원하는 생성자를 선택해서 사용할 수 있다.
	
	// 1. 컴파일러가 자동으로 제공하는 디폴트 생성자 (따로 만들지 않아도 자동으로 생성됨)
	public Person() {}
	
	// 2. 이름을 매개변수로 받는 생성자
	public Person(String pname) {
		name = pname;
	}
	
	
	/*
	 * Q) Code by Myself
	 * 이름, 키, 몸무게를 매개변수로 받는 생성자 추가하기
	 */
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
}
