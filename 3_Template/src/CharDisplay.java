
public class CharDisplay extends AbstructDisplay {
	private char ch;

	// constructor
	public CharDisplay(char c) {
		this.ch = c;
	}

	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(this.ch);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}

}