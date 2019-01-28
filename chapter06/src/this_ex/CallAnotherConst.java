package this_ex;

class Person {
	String name;
	int age;
	
	Person() {
		this("이름 없음", 1);		// Person(String, int) 생성자 호출
		// 만약 타 생성자 호출 문장 앞에 다른 실행문이 온다면
		// Constructor call must be the first statement in a constructor 에러 발생!
		// 생성자는 인스턴스가 생성될 때 호출되므로 인스턴스 생성이 완료되지 않은 시점에 다른 코드가 있다면 오류가 발생할 수 있다.
		// 즉, 디폴트 생성자에서 생성이 완료되는 것이 아니라 this를 사용해 다른 생성자를 호출하므로,
		// this를 활용해 다른 생성자를 호출하는 문장이 가장 먼저 와야 한다.
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person noName2 = new Person();
		System.out.println(noName2.name);
		System.out.println(noName2.age);
		
		Person p = noName.returnItSelf();		// this 값을 클래스 변수에 대입
		System.out.println(p);					// noName.retrunItSelf()의 반환 값 출력
		System.out.println(noName);				// 참조 변수 출력
	}

}
