
public class Main {

	public static void main(String[] args) {
		AbstructDisplay display1 = new CharDisplay('H');
		AbstructDisplay display2 = new StringDisplay("Hello World");

		display1.display();
		display2.display();

	}

}