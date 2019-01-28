package this_ex;

class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {		// 태어난 연도를 지정하는 메서드
		this.year = year;
	}
	
	public void printThis() {			// this 출력 메서드
		System.out.println(this);
	}
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);				// 태어난 연도를 2000으로 지정
		
		System.out.println(bDay);		// 참조 변수 출력
		bDay.printThis();				// this 출력 메서드 호출
	}
}
