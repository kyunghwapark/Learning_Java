package array;

import array.by_myself.Student;

// 깊은 복사

public class DeepCopyEx {

	public static void main(String[] args) {
		// String 타입 깊은 복사
		String[] stringArray1 = new String[3];
		String[] stringArray2 = new String[3];
		
		stringArray1[0] = "James";
		stringArray1[1] = "Tomas";
		stringArray1[2] = "Edward";
		
		stringArray2[0] = new String();
		stringArray2[1] = new String();
		stringArray2[2] = new String();
		
		for(int i=0; i<stringArray1.length; i++) {
			stringArray2[i] = stringArray1[i];
			System.out.println(stringArray2[i]);
		}
		
		stringArray1[0] = "Robin";
		System.out.println(stringArray1[0]);
		System.out.println(stringArray2[0]);
		
		
		// 객체(class) 타입 깊은 복사
		Student[] studentArray1 = new Student[3];
		Student[] studentArray2 = new Student[3];
		
		studentArray1[0] = new Student(1001, "James");
		studentArray1[1] = new Student(1002, "Tomas");
		studentArray1[2] = new Student(1003, "Edward");
		
		for(int i=0; i<studentArray2.length; i++) {
			studentArray2[i] = new Student();
			studentArray2[i].setStudentID(studentArray1[i].getStudentID());
			studentArray2[i].setName(studentArray1[i].getName());
			studentArray2[i].showStudentInfo();
		}
		
		// studentArray1[0] 값 변경
		studentArray1[0].setStudentID(2001);
		studentArray1[0].setName("Robin");
		
		System.out.println("=========studentArray1==========");
		for(int i=0; i<studentArray1.length; i++) {
			studentArray1[i].showStudentInfo();
		}
		
		System.out.println("=========studentArray2==========");
		for(int i=0; i<studentArray2.length; i++) {
			studentArray2[i].showStudentInfo();
		}
		
		
		
		
	}

}
