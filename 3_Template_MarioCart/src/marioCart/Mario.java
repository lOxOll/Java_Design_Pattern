package marioCart;

public class Mario extends Cart {

	private final int weight = 220;
	private final String name = "Mario";
	private final String type = "normal";

	@Override
	protected int weight(int weight) {
		return weight + this.weight;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getName() {
		return name;
	}
}
