package exercise;

public class Q1 {

	public static void main(String[] args) {
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value); 					// false
		
		System.out.println(myAge <= 25); 			// true
		System.out.println(myAge == teacherAge); 	//false
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		System.out.println(ch); 					// F
	}

}
