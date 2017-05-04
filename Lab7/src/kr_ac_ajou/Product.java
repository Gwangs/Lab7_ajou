package kr_ac_ajou;

public abstract class Product {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("error");
			System.exit(0);
		} else
			this.price = price;
	}
	abstract String getName();
}


