package itemFactory;

public class Main {

	public static void main(String[] args) {
		int money = 1000;
		AbstractFactory factory = new ItemFactory();
		Item potion = factory.create(10);
		
		potion.effect();

		potion.sell(3);
		
	}

}
