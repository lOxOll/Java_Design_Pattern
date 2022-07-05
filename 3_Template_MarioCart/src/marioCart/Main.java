package marioCart;

public class Main {

	public static void main(String[] args) {
		Cart bowserCart = new Bowser();
		Cart marioCart = new Mario();
		Cart peachCart = new Peach();
		
		bowserCart.calcStatus();
		marioCart.calcStatus();
		peachCart.calcStatus();

	}

}
