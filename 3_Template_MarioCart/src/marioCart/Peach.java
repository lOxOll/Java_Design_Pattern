package marioCart;

public class Peach extends Cart {

	private final int weight = 110;
	private final String name = "Princess Peach";
	private final String type = "light";

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
