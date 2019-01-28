package cooperation;

//Quiz) 나 혼자 코딩!!
public class Taxi {
	
	String taxiCompany;			// 택시 회사명 (운수업체명)
	int drivingCount;			// 주행(운행) 횟수
	int money;					// 수입액
	
	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;
	}
	
	public void take(int money) {
		this.money += money;
		drivingCount++;
	}
	
	public void showInfo() {
		System.out.println(
				taxiCompany + "의 주행 횟수는 " + drivingCount + "회이고, "
						+ "수입은 " + money + "원 입니다.");
	}
}
