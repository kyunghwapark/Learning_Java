package exercise.Q5;

import java.util.ArrayList;

import exercise.Q4.Dog;

public class DogTestArrayList {

	public static void main(String[] args) {

		ArrayList<Dog> dogs = new ArrayList<>();
		
		dogs.add(new Dog("다롱이", "시추"));
		dogs.add(new Dog("비글미", "비글"));
		dogs.add(new Dog("요키", "요크셔테리어"));
		dogs.add(new Dog("쿠키", "코카 스파니엘"));
		dogs.add(new Dog("파트라슈", "셔틀랜드 십독"));
		
		System.out.println("===== ArrayList 출력 =====");
		for(int i=0; i<dogs.size(); i++) {
			String info = dogs.get(i).showDogInfo();
			System.out.println(info);
		}
		
		System.out.println("=== 향상된 for문으로 출력 ===");
		for(Dog dog : dogs) {
			String info = dog.showDogInfo();
			System.out.println(info);
		}

	}

}
