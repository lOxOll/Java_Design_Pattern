import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<MyBook> {

	private BookShelf bookShelf;
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public MyBook next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		MyBook book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
