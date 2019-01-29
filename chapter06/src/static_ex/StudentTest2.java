package static_ex;

public class StudentTest2 {

	public static void main(String[] args) {
		
		// serialNum는 static 변수로, 인스턴스 생성 없이 호출 가능하다.
		System.out.println(Student2.getSerialNum());
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("Aaron Lee");
		System.out.println(studentLee.getSerialNum());
		System.out.println(Student2.getSerialNum()); 			// serialNum 변수를 얻는 getter를 직접 클래스 이름으로 참조
		System.out.println(studentLee.studentName + "의 학번 : " + studentLee.studentID);
		
		Student2 studentPark = new Student2();
		studentPark.setStudentName("Robin Park");
		System.out.println(studentPark.getSerialNum());
		System.out.println(Student2.getSerialNum()); 			// serialNum 변수를 직접 클래스 이름으로 참조
		System.out.println(studentPark.studentName + "의 학번 : " + studentPark.studentID);

	}

}
