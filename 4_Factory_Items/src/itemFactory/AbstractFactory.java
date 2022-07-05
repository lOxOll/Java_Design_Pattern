package itemFactory;

public abstract class AbstractFactory {
	protected abstract Item createItem(String itemName);

	public final Item create(String itemName) {
		Item item = createItem(itemName);
		return item;
	}
}
