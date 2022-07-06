package itemFactory;

public class Potion extends Item {
	private int num = 0;
	
	public Potion(int num) {
		this.num = num;
	}

	@Override
	public void sell(int num) {

		System.out.println("ポーションが" + num + "個売れました。");
		System.out.println();
		this.num -= num;

		System.out.println("残り" + this.num + "個です。");
	}

	@Override
	public void effect() {
		System.out.println("HPを30回復する薬です。");
		System.out.println();
	}

}
