package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student();		// 첫 번째 학생 생성
		student1.studentName = "Robin";			// 첫 번째 학생의 이름 설정
		System.out.println("첫 번째 학생 이름 : " + student1.getStudentName());
		
		Student student2 = new Student();		// 두 번째 학생 생성
		student2.setStudentName("Aaron");		// 두 번째 학생의 이름 설정
		System.out.println("두 번째 학생 이름 : " + student2.getStudentName());
	}
}
