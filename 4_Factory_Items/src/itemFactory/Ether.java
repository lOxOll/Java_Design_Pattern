package itemFactory;

public class Ether extends Item {

	private final int price = 200;
	private int num = 0;

	@Override
	public int buy(int num, int money) {
		int change = money - this.price * num;

		if (change < 0)
			throw new Error("所持金が足りません。");

		System.out.println("エーテルを" + num + "個買いました。");
		System.out.println("残金 :" + change);
		System.out.println();
		this.num += num;

		return change;
	}

	@Override
	public void use() {
		if (this.num < 1)
			throw new Error("持っていません。");

		System.out.println("エーテルを使います。");
		System.out.println("MPが回復した！");
		
		this.num -= 1;
	}
}
