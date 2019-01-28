package exercise;

public class Q4Test {

	public static void main(String[] args) {
		Q4 date1 = new Q4(30, 2, 2000);
		System.out.println(date1.isValid());
		
		Q4 date2 = new Q4(2, 10, 2006);
		System.out.println(date2.isValid());

	}

}
