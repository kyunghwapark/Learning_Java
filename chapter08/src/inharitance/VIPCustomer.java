package inharitance;

public class VIPCustomer extends Customer {
	// VIP 고객 전용 field
	private int agentID;	// VIP 고객 담당 상담원 아이디
	double saleRatio;		// 할인율
	
	// default constructor
	// 하위 클래스의 생성자에서 super():상위 클래스의 생성자 자동 호출 = 컴파일러가 super(); 자동으로 추가
//	public VIPCustomer() {
//		super.customerGrade = "VIP";	// 상위 클래스 Customer에서 private 변수로 두면 오류 발생 (protected 사용)
//		super.bonusRatio = 0.05;	// 보너스 적립 5%
//		this.saleRatio = 0.1;		// 할인율 10%
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	// 매개변수가 있는 생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	// 상위 클래스 생성자 호출
		this.agentID = agentID;
		super.customerGrade = "VIP";	// 상위 클래스 Customer에서 private 변수로 두면 오류 발생 (protected 사용)
		super.bonusRatio = 0.05;	// 보너스 적립 5%
		this.saleRatio = 0.1;		// 할인율 10%
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}
	
	// VIP 고객에게만 필요한 메서드
		public int getAgentID() {
			return this.agentID;
		}
	
//	public int calcPrice(int price) {
//		super.bonusPoint += price * bonusRatio;
////		price -= (int)(price * saleRatio);
////		return price;
//		return price - (int)(price*saleRatio);	// 할인율 적용 가격 return
//	}
	
	@Override					// 재정의한 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;			// 보너스 포인트 적립
		return price - (int)(price * saleRatio);	// 할인된 가격을 계산하여 반환
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + " 담당 상담원 아이디는 " + agentID + "입니다.";
	}
	
}
