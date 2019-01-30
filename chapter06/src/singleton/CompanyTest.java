package singleton;

public class CompanyTest {

	public static void main(String[] args) {

		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println("싱글톤 패턴 확인 : " + (myCompany1 == myCompany2));
	}

}
