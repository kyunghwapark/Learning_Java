package static_ex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNum);	// serialNum 변수의 초깃값 출력
		Student1.serialNum++;			// static 변수 값 증가
		
		
//		경고 : The static field Student.serialNum should be accessed in a static way
//		System.out.println(studentLee.serialNum);		
//		studentLee.serialNum++;
		
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNum);
		
		System.out.println(studentLee.serialNum);
		System.out.println(studentSon.serialNum);

	}

}
