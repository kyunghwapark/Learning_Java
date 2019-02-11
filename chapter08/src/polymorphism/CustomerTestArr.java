package polymorphism;

import java.util.ArrayList;

public class CustomerTestArr {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();

//		customerList.add(new Customer(10010, "이순신"));
//		customerList.add(new Customer(10020, "신사임당"));
//		customerList.add(new GoldCustomer(10030, "홍길동"));
//		customerList.add(new GoldCustomer(10040, "장보고"));
//		customerList.add(new VIPCustomer(10050, "김유신", 12345));
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerJang = new GoldCustomer(10040, "장보고");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerJang);
		customerList.add(customerKim);

		System.out.println("===== 고객 정보 출력 =====");	
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		for(Customer customer : customerList) {
			int cusPrice = customer.calcPrice(price);
			System.out.println(
					customer.getCustomerName() + "님이 " + cusPrice + "원 지불하셨습니다.");
			System.out.println(
					customer.getCustomerName() + "님의 현재 보너스 포인트는 " 
							+ customer.bonusPoint + "점 입니다.");
		}
	}

}
