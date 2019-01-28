package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// 학생 인스턴스 생성
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		// 버스 인스턴스 생성
		Bus bus100 = new Bus(100);
		
		studentJames.takeBus(bus100);		// James가 100번 버스를 탐
		studentJames.showInfo();			// James 정보 출력
		bus100.showInfo();					// 버스 정보 출력
		
		// 지하철 인스턴스 생성
		Subway subwayGreen = new Subway("2호선");
		
		studentTomas.takeSubway(subwayGreen);// Tomas가 2호선을 탐
		studentTomas.showInfo();			 // Tomas 정보 출력
		subwayGreen.showInfo();				 // 지하철 정보 출력
		
		
		
		//Quiz) 나 혼자 코딩!!
		// 택시 인스턴스 생성
		Student studentEdward = new Student("Edward", 35000);
		Taxi taxiHanjin = new Taxi("한진 운수");
		
		studentEdward.takeTaxi(taxiHanjin);	// Edward가 택시를 탐
		studentEdward.showInfo(); 			// Edward 정보 출력
		taxiHanjin.showInfo(); 				// 택시 정보 출력

	}

}
