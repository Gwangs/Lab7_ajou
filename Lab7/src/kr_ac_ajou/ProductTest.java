package kr_ac_ajou;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		ProductTest pt = new ProductTest();
		System.out.print("Type the Channel number. ");
		int channel = scan.nextInt();
		SmartTV smart = new SmartTV();
		smart.getName();
		smart.setchannel(channel);
		smart.getchannel();
		smart.isConnected();
		smart.maxSpeed();
		
		
		Laptop laptop = new Laptop();
		double usedcap = 52.8;
		double totalcap = 100.3;
		laptop.getName();
			
		laptop.setUsedCapacity(usedcap);
		laptop.setTotalCapacity(totalcap);
		laptop.format();
		laptop.isConnected();
		laptop.maxSpeed();
		

		Toaster t = new Toaster(35.6);
				
		pt.testProduct(t);
		pt.testCooker(t);
		pt.testDataStorage(laptop);
		scan.close();
	}
	public void testProduct(Product p){
		System.out.println("price : "+p.getPrice());
		System.out.println("Name : "+p.getName());
	}
	
	
	public void testDataStorage(DataStorage d) {
		System.out.println("Free Capacity : " + d.getFreeCapacity());
		d.format();
	}


	public void testNetworked(Networked n) {
		if(n.isConnected() == false) {
			System.out.println("Connection state : Not connnected");
		} else {System.out.println("Connection state : Connnected");}
		
		System.out.println("Max Speed : " + n.maxSpeed() + "\n");
	}

	public void testCooker(Cooker c){
		System.out.println(c.prepareFood());
	}
	
}