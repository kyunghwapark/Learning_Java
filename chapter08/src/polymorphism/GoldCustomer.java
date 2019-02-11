package polymorphism;

public class GoldCustomer extends Customer {
	
	// Gold 고객 전용 field
	double saleRatio;
	
	// 매개변수가 있는 생성자
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		super.customerGrade = "Gold";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}

	@Override					// 재정의한 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	

}
