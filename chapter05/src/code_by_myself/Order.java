package code_by_myself;

public class Order {
	
	// field
	String userId;
	String userName;
	String userAddress;
	
	String orderNum;
	String orderDate;
	String productNum;
	
	
	// getter & setter
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

}
