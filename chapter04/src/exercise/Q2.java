package exercise;

public class Q2 {

	public static void main(String[] args) {

		for(int dan=1; dan<=9; dan++) {
			
			if(dan%2 != 0) {
				continue;
			}
			
			System.out.println("< " + dan + "단 >");
			
			for(int times=1; times<=9; times++) {
				System.out.println(dan + " x " + times + " = " + dan*times);
			}
			
			System.out.println();
		}
	}
}
