package static_ex;

// Quiz) 나 혼자 코딩!
public class Student3 {
	private static int serialNum = 1000;
	private int studentID;
	private int studentCardNum;
	String studentName;
	int grade;
	String address;
	
	public Student3() {
		serialNum++;
		studentID = serialNum;
		studentCardNum = studentID + 100;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public int getStudentCardNum() {
		return studentCardNum;
	}
}
