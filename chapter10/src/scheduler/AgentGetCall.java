package scheduler;

// Quiz) 나 혼자 코딩! 상담 전화 배분 정책 추가하기
// : 상담 전화를 할당하는 방식이 아닌 상담원 본인이 필요할 때 가져오는 정책
public class AgentGetCall implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담원이 다음 전화 요청");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담원이 전화 상담을 가져갔습니다.");
	}

}
