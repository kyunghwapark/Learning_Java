package singleton;

public class Company {
	
	// 생성자를 private으로 정의
	private Company() {}
	
	// 프로그램 전체에서 사용할 유일한 인스턴스를 private static으로 생성
	private static Company instance = new Company();
	
	// 유일한 인스턴스를 외부에서 참조할 수 있도록 public get() 메서드 구현
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}
		return instance;		// 유일하게 생성한 인스턴스 반환
	}

}
