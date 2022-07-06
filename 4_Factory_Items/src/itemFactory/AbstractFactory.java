package itemFactory;

public abstract class AbstractFactory {
	protected abstract Item createItem(int num);

	public final Item create(int num) {
		Item item = createItem(num);
		return item;
	}
}
