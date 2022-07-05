package itemFactory;

public class ItemFactory extends AbstractFactory {

	@Override
	protected Item createItem(String itemName) {
		switch (itemName) {
		case "potion":
			return new Potion();
		case "ether":
			return new Ether();
		default:
			throw new IllegalArgumentException("存在しないアイテムです : " + itemName);
		}
	}

}
