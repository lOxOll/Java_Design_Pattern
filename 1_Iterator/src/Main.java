
public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(3);
		bookShelf.appendBook(new MyBook("言の葉の庭"));
		bookShelf.appendBook(new MyBook("三人のおっさん"));
		bookShelf.appendBook(new MyBook("鹿の王"));

		for (MyBook myBook : bookShelf) {
			System.out.println(myBook.getName());
		}
	}

}
