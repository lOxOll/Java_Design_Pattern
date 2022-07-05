
import java.util.Iterator;

public class BookShelf implements Iterable<MyBook> {
	private MyBook[] booklist;
	private int last = 0;

	public BookShelf(int maxSize) {
		this.booklist = new MyBook[maxSize];
	}

	public MyBook getBookAt(int index) {
		return booklist[index];
	}

	public void appendBook(MyBook book) {
		this.booklist[last] = book;
		last++;
	}

	public int getLength() {
		return last;
	}

	@Override
	public Iterator<MyBook> iterator() {
		return new BookShelfIterator(this);
	}
}
