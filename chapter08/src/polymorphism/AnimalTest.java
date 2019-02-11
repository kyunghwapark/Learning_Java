package polymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest aTest = new AnimalTest();
		// new로 인스턴스를 생성해서 매개변수로 직접 전달
		// 매개변수 : 상위 클래스의 인스턴스
		aTest.moveAnimal(new Animal());
		// 매개변수 : 하위 클래스의 인스턴스
		aTest.moveAnimal(new Human());		
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
	}
	
	// 매개변수의 자료형이 상위 클래스
	public void moveAnimal(Animal animal) {
		// Overriding된 메서드는 클래스형이 상위 클래스더라도(업캐스팅) 실제 인스턴스의 메서드를 따른다.
		//		= 재정의된 메서드가 호출됨.
		animal.move();
	}

}
