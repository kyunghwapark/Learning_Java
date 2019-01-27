package classpart;

public class Student {		// 접근제한자 + 클래스 생성 예약어 + 클래스 이름
	
	// 멤버 변수 (member variable) : field
	int studentID;			// 학번			
	String studentName;		// 학생 이름
	int grade;				// 학년
	String address;			// 주소
	
	
	// 메서드(method) = 멤버 함수(member function)
	public void showStudentInfo() {				// 이름, 주소를 출력하는 메서드
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {			// 학생의 이름을 반환하는 메서드
		return studentName;
	}
	
	public void setStudentName(String name) {	// 학생 이름을 매개변수로 전달받아 설정/수정하는 메서드
		this.studentName = name;
	}

}
