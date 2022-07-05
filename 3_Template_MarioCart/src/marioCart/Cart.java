package marioCart;

public abstract class Cart {
	private final int weight = 200;
	private final double speed = 100.0;
	private final double acceleration = 1.0;

	protected abstract int weight(int weight);

	public abstract String getType();

	public abstract String getName();

	public final void calcStatus() {
		switch (getType()) {
		case "heavy": {
			int weight = weight(this.weight);
			double speed = this.speed * 1.5 * (weight * 0.001);
			double acceleration = this.acceleration * 0.6 * (weight * 0.01);
			this.showStatus(weight, speed, acceleration, getName());
			break;
		}
		case "light": {
			int weight = weight(this.weight);
			double speed = this.speed * 0.9 * (weight * 0.001);
			double acceleration = this.acceleration * 2.0 * (weight * 0.01);
			this.showStatus(weight, speed, acceleration, getName());
			break;
		}
		case "normal": {
			int weight = weight(this.weight);
			double speed = this.speed * 1.0 * (weight * 0.001);
			double acceleration = this.acceleration * 1.2 * (weight * 0.01);
			this.showStatus(weight, speed, acceleration, getName());
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
		}
	}

	private void showStatus(int weight, double speed, double acceleration, String name) {
		System.out.println(name);
		System.out.println("重さ : " + weight);
		System.out.println("スピード : " + speed);
		System.out.println("加速 : " + acceleration);
		System.out.println();
	}
}
