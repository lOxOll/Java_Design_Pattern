public class StringDisplay extends AbstructDisplay {
	private String string;
	private int width;

	public StringDisplay(String string) {
		this.string = string;
		this.width = string.length();
	}

	@Override
	public void open() {
		printLane();

	}

	@Override
	public void print() {
		System.out.println("|" + string + "|");

	}

	@Override
	public void close() {
		printLane();
	}

	private void printLane() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}