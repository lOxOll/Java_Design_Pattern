package itemFactory;

public class Potion extends Item {

	private final int price = 100;
	private int num = 0;

	@Override
	public int buy(int num, int money) {
		int change = money - this.price * num;

		if (change < 0)
			throw new Error("所持金が足りません。");

		System.out.println("ポーションを" + num + "個買いました。");
		System.out.println("残金 :" + change);
		System.out.println();
		this.num += num;

		return change;
	}

	@Override
	public void use() {
		if (this.num < 1)
			throw new Error("持っていません。");

		System.out.println("ポーションを使います。");
		System.out.println("HPが回復した！");
		
		this.num -= 1;
	}

}
