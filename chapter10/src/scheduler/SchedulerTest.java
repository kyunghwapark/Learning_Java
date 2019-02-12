package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		System.out.println("A : 상담원 본인이 요청할 때 전화 상담 진행");
		
		// 할당 방식을 입력받아 ch 변수에 대입
		int ch = System.in.read();
		// 인터페이스는 인스턴스 생성이 불가하므로 인터페이스형 변수를 null로 선언
		Scheduler scheduler = null;
		
		// 입력받은 값에 따라 해당되는 클래스(인터페이스를 구현한)의 인스턴스를 생성해서
		// 인터페이스형 변수에 대입
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		} else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		} else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		} else if(ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		} else {
			System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
			return;
		}
		
		// 어떤 정책인가와 상관 없이 인터페이스에 선언한 메서드 호출 = 인터페이스를 활용해 다형성 구현
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
