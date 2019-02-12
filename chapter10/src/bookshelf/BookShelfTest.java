package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		
		bookShelf.shelf.add("이것이 자바다");
		bookShelf.shelf.add("자바의 정석");
		bookShelf.shelf.add("자바프로그래밍 입문");
		
		System.out.println("===== 기존 책장 =====");
		for(String aBook : bookShelf.shelf) {
			System.out.println(aBook);
		}
		
		bookShelf.enQueue("열혈 자바 프로그래밍");
		
		System.out.println("===== 도서 추가 =====");
		for(String aBook : bookShelf.shelf) {
			System.out.println(aBook);
		}
		
		bookShelf.deQueue();
		System.out.println("===== 도서 제거 =====");
		for(String aBook : bookShelf.shelf) {
			System.out.println(aBook);
		}
		
		System.out.println("===== 현재 책장 도서 수 =====");
		System.out.println(bookShelf.getCount());

	}

}
