
public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(3);
		bookShelf.appendBook(new MyBook("ハリー・ポッターと賢者の石"));
		bookShelf.appendBook(new MyBook("容疑者Xの献身"));
		bookShelf.appendBook(new MyBook("星の王子さま"));

		for (MyBook myBook : bookShelf) {
			System.out.println(myBook.getName());
		}
	}

}
