package itemFactory;

public class Main {

	public static void main(String[] args) {
		int money = 1000;
		AbstractFactory factory = new ItemFactory();
		Item potion = factory.create("potion");
		Item ether = factory.create("ether");

		money = potion.buy(3, money);
		money = ether.buy(2, money);
		
		potion.use();
		potion.use();
		ether.use();
		ether.use();
		ether.use();
		
	}

}
