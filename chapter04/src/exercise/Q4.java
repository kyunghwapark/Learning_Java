package exercise;

public class Q4 {

	public static void main(String[] args) {
		int pyramidRow = 4;
		int pyramidStar = 1;
		int pyramidSpace = 3;

		for (int i = 0; i < pyramidRow; i++) {
			for (int j = 0; j < pyramidSpace; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < pyramidStar; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < pyramidSpace; j++) {
				System.out.print(" ");
			}
			System.out.println();
			pyramidSpace--;
			pyramidStar += 2;

		}

	}

}
