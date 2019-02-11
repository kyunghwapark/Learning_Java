package exercise.Q5;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<>();
		
		carList.add(new Sonata());
		carList.add(new Avante());
		carList.add(new Grandeur());
		carList.add(new Genesis());
		
		for(Car car : carList) {
			car.run();
			System.out.println("====================");
		}

	}

}
