package kr_ac_ajou;


public class ProductTest {

	public static void main(String[] args) {
		Product lt = new Laptop();
		Product st = new SmartTV();
		Product t = new Toaster();
		ProductTest pt = new ProductTest();
		DataStorage l2 = new Laptop();
		Networked l3 = new Laptop();
		Networked st2 = new SmartTV();
		Cooker ct = new Toaster();
		
		System.out.println(lt.getName());
		System.out.println();
		pt.testDataStorage(l2);
		pt.testNetworked(l3);
		
		System.out.println(st.getName());
		System.out.println();
		pt.testNetworked(st2);
		System.out.println();
		System.out.println(t.getName());
		System.out.println();
		pt.testCooker(ct);
	}
	
	
	public void testDataStorage(DataStorage d) {
		System.out.println(d.getFreeCapacity());
		d.format();
	}


	public void testNetworked(Networked n) {
		if(n.isConnected() == false) {
			System.out.println("Connection state : Not connnected");
		} else {System.out.println("Connection state : Connnected");}
		
		System.out.println("Max Speed : " + n.maxSpeed());
	}

	public void testCooker(Cooker c){
		System.out.println(c.prepareFood());
	}
	
}
