package exercise;

public class Q4 {
	// 05-7에서 예제로 나온 MyDate 클래스 완성하기
	
	// 멤버 변수 (필드)
	private int day;
	private int month;
	private int year;
	
	
	// 생성자 (클래스 이름과 동일)
	public Q4(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	// 메서드 (getter, setter)
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	// 날짜 유효성 검사하는 메서드
	public boolean isValid() {
		if(year >= 0) {
			switch(month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					if(day>0 && day <32) {
						System.out.println("유효한 날짜입니다.");
						return true;
					}
					break;
				case 2:
					if(day>0 && day < 29) {
						System.out.println("유효한 날짜입니다.");
						return true;
					}
					break;
				case 4: case 6: case 9: case 11:
					if(day>0 && day <31) {
						System.out.println("유효한 날짜입니다.");
						return true;
					}
					break;
				default : 
					System.out.println("유효하지 않은 날짜입니다.");
					return false;
			}
		}
		System.out.println("유효하지 않은 날짜입니다.");
		return false;
	}

}
