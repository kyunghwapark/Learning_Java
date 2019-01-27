package code_by_myself;

public class OrderTest {

	public static void main(String[] args) {
		
		Order orderSample = new Order();
		
		orderSample.setOrderNum("201803120001");
		orderSample.setUserId("abc123");
		orderSample.setOrderDate("2018년 3월 12일");
		orderSample.setUserName("홍길순");
		orderSample.setProductNum("PD0345-12");
		orderSample.setUserAddress("서울시 영등포구 여의도동 20번지");
		
		System.out.println("    < 주문 내용 >");
		System.out.println("주문 번호 : " + orderSample.getOrderNum());
		System.out.println("주문자 아이디 : " + orderSample.getUserId());
		System.out.println("주문 날짜 : " + orderSample.getOrderDate());
		System.out.println("주문자 이름 : " + orderSample.getUserName());
		System.out.println("주문 상품 번호 : " + orderSample.getProductNum());
		System.out.println("배송 주소 : " + orderSample.getUserAddress());

	}

}
