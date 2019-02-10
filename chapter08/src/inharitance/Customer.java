package inharitance;

public class Customer {
	// field
	protected int customerID;			// 고객 아이디
	protected String customerName;	// 고객 이름
	protected String customerGrade;	// 고객 등급
	int bonusPoint;					// 보너스 포인트
	double bonusRatio;				// 적립 비율
	
	// default constructor
//	public Customer() {
//		this.customerGrade = "Silver";	// 기본 등급
//		this.bonusRatio = 0.01;		// 보너스 포인트 기본 적립 비율
//		System.out.println("Customer() 생성자 호출");
//	}
	
	// 매개변수가 있는 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";	// 기본 등급
		this.bonusRatio = 0.01;		// 보너스 포인트 기본 적립 비율
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	// 보너스 포인트 적립, 지불 가격 계산 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	// 보너스 포인트 계산
		return price;
	}
	
	// 고객 정보를 반환하는 메서드
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
