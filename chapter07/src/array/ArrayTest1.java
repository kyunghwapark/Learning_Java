package array;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int sum = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println(sum);

	}

}
