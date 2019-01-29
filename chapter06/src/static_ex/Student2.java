package static_ex;

// 학번 자동으로 부여하기
public class Student2 {
	private static int serialNum = 1000;	// static변수는 인스턴스 생성과 상관 없이 먼저 생성됨
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;				// 학생이 생성될 때마다 증가
		studentID = serialNum;	// 증가된 값을 학번 인스턴스 변수에 부여
	}
	
	public static int getSerialNum() {
		int test = 10;				// 지역변수
//		studentName = "이지원";		오류 발생 => 왜냐하면 인스턴스가 생성될 때 만들어지는 인스턴스 변수이기 때문!
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
