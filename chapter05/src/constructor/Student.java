package constructor;

public class Student {
	int studentID;
	String name;
	
	/*
	 * 학생이 생성될 때 (Student의 인스턴스 생성) 반드시 학번이 있어야 한다면
	 * 학번을 매개변수로 입력받는 생성자를 정의하자.
	 * 이렇게 하면 항상 학번을 사용하여야만 Student 인스턴스를 생성할 수 있으며,
	 * 디폴트 생성자를 별도로 정의하지 않는다. (왜냐하면 학번이 필수 요소이기 때문에) 
	 */
	public Student(int studentID) {
		this.studentID = studentID;
	}

}
