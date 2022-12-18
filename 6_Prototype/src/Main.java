import framework.Manager;
import framework.Product;

public class Main {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		UnderLinePen ul = new UnderLinePen('-');
		MessageBox mb = new MessageBox('^');
		MessageBox mb2 = new MessageBox('*');
		
		manager.register("string message", ul);
		manager.register("warning box", mb);
		manager.register("astarisk", mb2);
		
		Product p1 = manager.create("string message");
		p1.use("hello");
		
		Product p2 = manager.create("warning box");
		p2.use("warn");
		
		Product p3 = manager.create("astarisk");
		p3.use("astasrsk");
		

	}

}
