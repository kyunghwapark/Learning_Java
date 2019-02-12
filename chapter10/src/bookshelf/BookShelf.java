package bookshelf;

public class BookShelf extends Shelf implements Queue {

	// 배열에 요소 추가
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	// 맨처름 요소를 배열에서 삭제하고 반환
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	// 배열 요소 개수 반환
	@Override
	public int getSize() {
		return getCount();
	}

}
