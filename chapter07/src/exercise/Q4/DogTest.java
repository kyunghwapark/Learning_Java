package exercise.Q4;

public class DogTest {

	public static void main(String[] args) {

		Dog[] dogs = new Dog[5];
		
		dogs[0] = new Dog("다롱이", "시추");
		dogs[1] = new Dog("비글미", "비글");
		dogs[2] = new Dog("요키", "요크셔테리어");
		dogs[3] = new Dog("쿠키", "코카 스파니엘");
		dogs[4] = new Dog("파트라슈", "셔틀랜드 십독");
		
		System.out.println("===== 배열 출력 =====");
		for(int i=0; i<dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		System.out.println("=== 향상된 for문으로 배열 출력 ===");
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}

	}

}
