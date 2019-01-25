package exercise;

public class Q3 {

	public static void main(String[] args) {
		
		for(int dan=1; dan<=9; dan++) {
			
			System.out.println();
			System.out.println("< " + dan + "단 >");
			
			for(int times=1; times<=9; times++) {
				
				if(dan < times) {
					break;
				}
				
				System.out.println(dan + " x " + times + " = " + dan*times);
			}
		}

	}

}
