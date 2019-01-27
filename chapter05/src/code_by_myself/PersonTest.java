package code_by_myself;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personSample = new Person();
		
		personSample.setAge(40);
		personSample.setName("James");
		personSample.setMarried(true);
		personSample.setChildrenNum(3);
		
		
		System.out.println("이 사람의 나이 : " + personSample.getAge());
		System.out.println("이 사람의 이름 : " + personSample.getName());
		System.out.println("이 사람의 결혼 여부 : " + personSample.marriedToString());
		System.out.println("이 사람의 자녀 수 : " + personSample.getChildrenNum());

	}

}
