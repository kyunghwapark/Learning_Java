package arraylist;

import java.util.ArrayList;

public class Student {
	
	// field
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	// constructor
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.subjectList = new ArrayList<>();
	}
	
	// 학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setScore(score);
		subjectList.add(subject);
	}
	
	// 배열 요소 값 출력
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScore();		// 총점 더하기
			System.out.println(
					"학생 " + studentName + "의 " + s.getSubjectName() + " 과목 성적은 " + s.getScore() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
}
