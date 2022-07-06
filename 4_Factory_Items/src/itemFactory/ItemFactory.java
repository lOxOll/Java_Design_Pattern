package itemFactory;

public class ItemFactory extends AbstractFactory {

	@Override
	protected Item createItem(int num) {
		System.out.println(num + "個入荷しました。" );
		System.out.println();
		return new Potion(num);
	}
}
