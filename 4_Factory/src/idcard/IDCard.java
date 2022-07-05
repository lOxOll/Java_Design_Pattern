package idcard;

import framework.Product;

public class IDCard extends Product {

	private String owner;

	public IDCard(String owner) {
		System.out.println(owner + "のカードを作成します");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(this + "を使います");
	}
	
	@Override
	public String toString() {
		String idCardString = "IDCard";
		return "[" + idCardString + " :" + this.owner + "]";
	}
	
	public String getOwner() {
		return this.owner;
	}

}
