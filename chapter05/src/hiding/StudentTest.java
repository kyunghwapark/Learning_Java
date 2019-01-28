package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		
//		studentLee.studentName = "이상원";		멤버 변수의 접근제어자가 private이기 때문에 오류 발생
		studentLee.setStudentName("이상원");		// 이렇게 접근 제어자가 public인 setter를 통해 값을 설정해야 한다. 
												// (setStudentName() 메서드를 활용해 같은 클래스 내 private 변수에 접근 가능)
		
		studentLee.studentID = 1;
		System.out.println(studentLee.getStudentName());

	}

}
