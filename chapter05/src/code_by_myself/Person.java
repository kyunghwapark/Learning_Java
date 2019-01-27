package code_by_myself;

public class Person {
	
	// field 선언
	private int age;
	private String name;
	private boolean isMarried;
	private int childrenNum;
	
	
	// getter, setter 정의
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public String marriedToString() {
		if(isMarried==true) {
			return "기혼";
		}
		return "미혼";
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChildrenNum() {
		return childrenNum;
	}
	public void setChildrenNum(int childrenNum) {
		this.childrenNum = childrenNum;
	}
}
