package array.by_myself;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		
		// ArrayList 선언
		ArrayList<Student> students = new ArrayList<>();
		
		// add() 메서드로 요소 값 추가
		students.add(new Student(1001, "James"));
		students.add(new Student(1002, "Tomas"));
		students.add(new Student(1003, "Edward"));
		
		// 배열에 추가된 요소 개수만큼 출력
		for(int i=0; i<students.size(); i++) {
			Student student = students.get(i);
			student.showStudentInfo();			
//			students.get(i).showStudentInfo();	
		}
		
		System.out.println();
		System.out.println("=====향상된 for문 사용=====");
		
		// 향상된 for문 사용해서 출력
		for(Student student : students) {
			student.showStudentInfo();
		}
	}

}
