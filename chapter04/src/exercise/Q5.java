package exercise;

public class Q5 {

	public static void main(String[] args) {
		int diaRow = 7;
		int diaStar = 1;
		int diaSpace = 3;

		for (int i = 0; i < diaRow; i++) {
			if (i < (int) diaRow / 2) {
				for (int j = 0; j < diaSpace; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < diaStar; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < diaSpace; j++) {
					System.out.print(" ");
				}
				System.out.println();
				diaSpace--;
				diaStar += 2;
			} else {
				for (int j = 0; j < diaSpace; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < diaStar; j++) {
					System.out.print("*");
				}
				for (int j = 0; j < diaSpace; j++) {
					System.out.print(" ");
				}
				System.out.println();
				diaSpace++;
				diaStar -= 2;
			} 
		}
	}

}
