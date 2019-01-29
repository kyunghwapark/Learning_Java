package static_ex;

public class StudentTest3 {

	public static void main(String[] args) {
		System.out.println(Student3.getSerialNum());
		
		Student3 student1 = new Student3();
		System.out.println("첫 번째 학생의 ID : " + student1.getStudentID());
		System.out.println("첫 번째 학생의 카드번호 : " + student1.getStudentCardNum());
		
		Student3 student2 = new Student3();
		System.out.println("두 번째 학생의 ID : " + student2.getStudentID());
		System.out.println("두 번째 학생의 카드번호 : " + student2.getStudentCardNum());
		

	}

}
