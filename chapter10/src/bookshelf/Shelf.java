package bookshelf;

import java.util.ArrayList;

public class Shelf {
	// 자료를 순서대로 저장할 ArrayList 선언
	// 이름을 저장할 수 있도록 자료형은 String
	protected ArrayList<String> shelf;
	
	// 디폴트 생성자로 Shelf 클래스의 인스턴스를 생성하면 ArrayList도 생성됨
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
	
}
