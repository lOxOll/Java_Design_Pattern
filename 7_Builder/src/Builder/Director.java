package Builder;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("あいさつ");
		builder.makeItems(new String[] { "how are you", "hello", "hi" });
		builder.makeString("時間帯に応じた挨拶");
		builder.makeItems(new String[] { "good morning", "good afternoon", "good evening" });
		builder.close();
	}
}
