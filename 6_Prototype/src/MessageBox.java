import framework.Product;

public class MessageBox implements Product {
	private char decoChar;
	
	public MessageBox(char c) {
		this.decoChar = c;
	}

	public void use(String s) {
		int decolen = 1 + s.length();
		for (int i = 0; i < decolen; i++) {
			System.out.print(decoChar);
		}
		System.out.println();
		System.out.println(decoChar + s + decoChar);
		for(int i = 0; i < decolen; i++) {
			System.out.print(decoChar);
		}
		System.out.println();
	}

	@Override
	public Product createCopy() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
