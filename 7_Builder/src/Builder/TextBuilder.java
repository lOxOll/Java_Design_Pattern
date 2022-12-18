package Builder;

public class TextBuilder extends Builder {
	private StringBuilder sbBuilder = new StringBuilder();

	@Override
	public void makeTitle(String title) {
		sbBuilder.append("========================\n");
		sbBuilder.append("「");
		sbBuilder.append(title);
		sbBuilder.append("」\n\n");

	}

	@Override
	public void makeString(String str) {
		sbBuilder.append("■");
		sbBuilder.append(str);
		sbBuilder.append("\n\n");

	}

	@Override
	public void makeItems(String[] items) {
		for (String s : items) {
			sbBuilder.append(".\n");
			sbBuilder.append(s);

		}

	}

	@Override
	public void close() {
		sbBuilder.append("\n==========================\n");
	}
	
	public String getTextResult() {
		return sbBuilder.toString();
	}

}
