package kr_ac_ajou;

public class Toaster extends Product implements Cooker{

	
	public Toaster(double price){
		setPrice(price);
	};
	
	@Override
	public String prepareFood() {
		return "prepare toaster to cook!";
	}

	@Override
	public String getName() {
		return "Toaster_H";
	}
 
}