
public abstract class AbstructDisplay {
	// open , close, print はサブクラスにお任せする
	public abstract void open();

	public abstract void print();

	public abstract void close();

	// display だけはここで実装する
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}