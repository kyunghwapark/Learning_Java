package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "Robin";
		
		Student student2 = new Student();
		student2.setStudentName("Aaron");
		
		// 참조 변수(student1, student2)값 출력 
		//			= 힙 메모리에 생성된 인스턴스의 메모리 주소 (해시 코드 hash code 값)
		//			= 참조 값
		System.out.println(student1);
		System.out.println(student2);
	}

}
