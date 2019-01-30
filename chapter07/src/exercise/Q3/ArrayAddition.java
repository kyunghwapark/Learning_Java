package exercise.Q3;

public class ArrayAddition {

	public static void main(String[] args) {

		int[] even = new int[5];
		int sum = 0;

		for (int i = 0; i < even.length; i++) {
			for (int j = 2 * i + 1; j <= 2 * i + 2; j++) {
				if (j % 2 != 0) {
					continue;
				} else {
					even[i] = j;
				}
			}
			System.out.println(even[i]);
			sum += even[i];
		}
		System.out.println("1~10까지 짝수의 합은 : " + sum);
	}

}
