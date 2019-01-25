package ifexample;

public class IfExample2 {
	
	public static void main(String[] args) {
		int age = 60;
		int charge;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		} else if (age < 60){
			charge = 3000;
			System.out.println("청, 장년입니다.");
			
			
		// 1분 복습
		} else {
			charge = 0;
			System.out.println("경로우대 대상입니다.");
		}
		
		System.out.println("나이가 " + age + "세 인 경우 입장료는 " + charge + "원 입니다.");
	}
}
