package kr_ac_ajou;

public class Toaster extends Product implements Cooker{

	public double price;
	public Toaster(double price){
		setPrice(price);
		this.price = getPrice();
	};
	
	@Override
	public String prepareFood() {
		return "prepare toaster to cook";
	}

	@Override
	public String getName() {
		return "ToasterH";
	}

}