package polymorphism;

import java.util.ArrayList;

class Animal2 {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human2 extends Animal2 {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger2 extends Animal2 {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle2 extends Animal2 {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest2 {

	// 배열의 자료형은 Animal2형으로 지정
	ArrayList<Animal2> aniList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal();
		System.out.println("===== 원래 형으로 다운 캐스팅 =====");
		aTest.testCasting();
	}
	
	public void addAnimal() {
		// ArrayList에 추가되면서 Animal2형으로 형변환
		aniList.add(new Human2());
		aniList.add(new Tiger2());
		aniList.add(new Eagle2());
		
		// 배열 요소를 Animal2형으로 꺼내서 move()를 호출하면
		// 실제 인스턴스에서 재정의 된 함수가 호출됨.
		// 업캐스팅 상태에서 인스턴스에서 A의 재정의된 메서드를 호출하는 이런 방식은
		// 상위 클래스에 A 메서드가 존재해야만 가능함.
		for(Animal2 animal : aniList) {
			animal.move();
		}
	}
	
	public void testCasting() {
		// 방법 1 : for문
		for(int i=0; i<aniList.size(); i++) {	// 모든 배열 요소를 하나씩 돌면서
			Animal2 animal = aniList.get(i);	// Animal2형으로 가져옴
			
			if(animal instanceof Human2) {		// Human2이면
				Human2 human = (Human2)animal;	// Human2형으로 다운 캐스팅 (예약어 : instanceof)
				human.readBook();
			} else if(animal instanceof Tiger2) {
				Tiger2 tiger = (Tiger2)animal;
				tiger.hunting();
			} else if(animal instanceof Eagle2) {
				Eagle2 eagle = (Eagle2)animal;
				eagle.flying();
			} else {
				System.out.println("지원되지 않는 형식입니다.");
			}
		
		}
		
		// 방법 2 : 향상된 for문
		for(Animal2 animal : aniList) {
			if(animal instanceof Human2) {
				Human2 human = (Human2)animal;
				human.readBook();
			} else if(animal instanceof Tiger2) {
				Tiger2 tiger = (Tiger2)animal;
				tiger.hunting();
			} else if(animal instanceof Eagle2) {
				Eagle2 eagle = (Eagle2)animal;
				eagle.flying();
			} else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	
	}
}
