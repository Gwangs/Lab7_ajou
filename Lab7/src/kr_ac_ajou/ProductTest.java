package asfdsafs;

import java.util.Scanner;

import asfdsafs.Laptop;

/*
import test.Cooker;
import test.Product;
import test.Toaster;
*/

public class ProductTest {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		
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
		laptop.getFreeCapacity();
		
		laptop.format();
		
		laptop.isConnected();
		laptop.maxSpeed();
		
		//예시 이렇게 하면 될것 같아요, setter에 가디언 붙여주세요(조건) 
		//목요일 10시까지 마무리하는 걸로 하죠
		//한글 주석은 지워도 돼요. import도 굳이 안해줘도 돼요. 같은 패키지에 있으니까....

		Toaster t = new Toaster(35.6);
				
		testProduct(t);
		testCooker(t);

		
	}
	//예시
	public static void testProduct(Product p){
		System.out.println("price : "+p.getPrice());
		System.out.println("Name : "+p.getName());
	}
	
/*
	public void testDadaStorage(DataStorage){
		
	}

	public void testNetworked(Networked){
		
	}
*/
	
	public void testNetworked(Networked) {
		
	}

	public static void testCooker(Cooker c){
		System.out.println(c.prepareFood());
	}
	
}
