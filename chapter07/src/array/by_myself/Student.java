package array.by_myself;

/*
 * Quiz) 나 혼자 코딩!
 * 객체 배열 만들어 활용하기
 */

public class Student {
	// field
	int studentID;
	String name;
	
	// constructor
	public Student() {}
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	// method
	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
