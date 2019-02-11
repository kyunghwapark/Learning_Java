package abstract_ex;

public abstract class Computer {
	/*
	 * <의미>
	 * Computer를 상속받는 클래스 중 trunOn()과 turnOff() 구현 코드는 공통이므로 상위 클래스에서 구현.
	 * 
	 * display()와 typing()은 하위 클래스에 따라 구현이 달라질 수  있으므로
	 * Computer에서 구현하지 않고, 이 두 메서드 구현에 대한 책임을 상속받는 클래스에 위임한다.
	 */
	
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
