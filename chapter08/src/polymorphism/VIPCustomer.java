package polymorphism;

public class VIPCustomer extends Customer {
	
	// VIP 고객 전용 field
	private int agentID;	// VIP 고객 담당 상담원 아이디
	double saleRatio;		// 할인율
	
	
	// 매개변수가 있는 생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	// 상위 클래스 생성자 호출
		this.agentID = agentID;
		super.customerGrade = "VIP";	// 상위 클래스 Customer에서 private 변수로 두면 오류 발생 (protected 사용)
		super.bonusRatio = 0.05;	// 보너스 적립 5%
		this.saleRatio = 0.1;		// 할인율 10%
	}
	
	// VIP 고객에게만 필요한 메서드
		public int getAgentID() {
			return this.agentID;
		}
	
	
	@Override					// 지불 가격 메서드 재정의
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;			// 보너스 포인트 적립
		return price - (int)(price * saleRatio);	// 할인된 가격을 계산하여 반환
	}

	@Override					// 고객 정보 출력 메서드 재정의
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 아이디는 " + agentID + "입니다.";
	}
	
	
}
