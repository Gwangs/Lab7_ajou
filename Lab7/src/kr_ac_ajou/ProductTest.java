package kr_ac_ajou;

/*
import test.Cooker;
import test.Product;
import test.Toaster;
*/

public class ProductTest {

	public static void main(String[] args){
		//Laptop lap = new Laptop();
		
		//���� �̷��� �ϸ� �ɰ� ���ƿ�, setter�� ����� �ٿ��ּ���(����) 
		//����� 10�ñ��� �������ϴ� �ɷ� ����
		//�ѱ� �ּ��� ������ �ſ�. import�� ���� �����൵ �ſ�. ���� ��Ű���� �����ϱ�....

		Toaster t = new Toaster(35.6);
				
		testProduct(t);
		testCooker(t);

		
	}
	//����
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

	public static void testCooker(Cooker c){
		System.out.println(c.prepareFood());
	}
	
}
