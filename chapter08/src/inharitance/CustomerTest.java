package inharitance;

public class CustomerTest {

	public static void main(String[] args) {
		// 일반 고객
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerID(10010);
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());

		// VIP 고객
//		VIPCustomer vipKim = new VIPCustomer();
//		vipKim.setCustomerName("김유신");
//		vipKim.setCustomerID(10020);
//		vipKim.bonusPoint = 10000;
//		System.out.println(vipKim.showCustomerInfo());
		
		// 매개변수가 있는 생성자로 객체 생성test
		VIPCustomer vipKim = new VIPCustomer(10020, "김유신", 01);
		vipKim.bonusPoint = 10000;
//		System.out.println(vipKim.showCustomerInfo());
		System.out.println(vipKim.showVIPInfo());
	}

}
