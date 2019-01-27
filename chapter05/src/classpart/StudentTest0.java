package classpart;

public class StudentTest0 {

	public static void main(String[] args) {
		Student studentSample = new Student();
		
		studentSample.studentID = 200;
		studentSample.setStudentName("Robin");
		studentSample.grade = 3;
		studentSample.address = "서울시";
		
		System.out.println(studentSample.studentID);
		System.out.println(studentSample.studentName);
		System.out.println(studentSample.getStudentName());
		System.out.println(studentSample.grade + "학년");
		System.out.println(studentSample.address);
	}
}
