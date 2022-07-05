package marioCart;

public class Bowser extends Cart {
	
	private final int weight = 300;
	private final String name = "Bowser";
	private final String type = "heavy";

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
