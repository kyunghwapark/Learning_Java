package abstract_ex;

public class DeskTop extends Computer {
	
	// 상속받은 추상 메서드의 body를 모두 구현해야 concrete class가 된다.
	// 하나라도 빠뜨리면 abstract method가 남아있기 때문에 abstract class이다.
	
	@Override
	void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	void typing() {
		System.out.println("DeskTop typing()");
	}

}
