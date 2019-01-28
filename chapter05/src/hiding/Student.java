package hiding;

public class Student {
	public int studentID;
	private String studentName;
	int grade;
	String address;
	
	// getter : private 변수인 studentName에 접근해 값을 가져오는 public get()메서드
	public String getStudentName() {
		return studentName;
	}
	// setter : private 변수인 studentName에 접근해 값을 지정하는 public set()메서드
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
