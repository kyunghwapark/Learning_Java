package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		// VIPCustomer를 Customer형으로 선언
		Customer vipKim = new VIPCustomer(10020, "김유신", 12345);
		vipKim.bonusPoint = 1000;
		System.out.println(vipKim.showCustomerInfo());
		
		System.out.println();
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = vipKim.calcPrice(price);
		
		System.out.println(customerLee.getCustomerName() + "님이 " + leePrice + "원 지불하셨습니다.");
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println(vipKim.getCustomerName() + "님이 " + kimPrice + "원 지불하셨습니다.");
		System.out.println(vipKim.showCustomerInfo());
		

	}

}
