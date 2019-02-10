package inharitance;

public class OverridingTest1 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원 입니다.");
		
		VIPCustomer vipKim = new VIPCustomer(10020, "김유신", 12345);
		vipKim.bonusPoint = 10000;
		System.out.println(vipKim.getCustomerName() + "님이 지불해야 하는 금액은 " + vipKim.calcPrice(price) + "원 입니다.");
		
		// * 재정의된 메서드는 (가상 메서드 테이블에 따라) 클래스형에 상관 없이 실제 인스턴스에 해당하는 메서드가 호출된다.
		// 즉, VIPCustomer로 생성하고 Customer형으로 변환(업캐스팅)한 vc는 원래 Customer형 메서드가 호출되는 것이 맞지만
		// 가상 메서드 방식에 의해 VIPCustomer 인스턴스의 재정의된 메서드가 호출됨
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원 입니다.");		

	}

}
