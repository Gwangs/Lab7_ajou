package kr_ac_ajou;

public class Laptop extends Product implements Networked, DataStorage {
	private double totalCapacity;
	private double usedCapacity;
	

	@Override
	public double getFreeCapacity(){
		double freecapacity = totalCapacity - usedCapacity;
		System.out.print("Free Capacity is ");
		
		return freecapacity;
	}
	
	@Override
	public void format(){
		System.out.println("It's 15.6 inches wide.");
	}
	
	@Override
	public boolean isConnected(){
		boolean connected = true;
		System.out.println("Internet Connected condition: " +connected);
		return connected;
	}
	
	@Override
	public double maxSpeed(){
		System.out.println();
		System.out.println("Now Checking internet conditon");
		
		double max = 67.30;
		double ping = 0.007;
		System.out.println("Internet Speed: " +max+ " Mbps");
		System.out.println("Ping: " +ping+ " Seconds");
		
			if(max > 30) {
			System.out.println("Internet Speed Condition : OK");
		}
		if(max < 70) {
			System.out.println("Speed is fine, but not fastest.");
		}
		if(ping < 0.05) {
			System.out.println("There is no delay in internet.");
		}
		
		return max;
	}
	
	public double getTotalCapacity(){
		return totalCapacity;
	}
	
	public void setTotalCapacity(double totalCapacity){
		if(totalCapacity > 0) {
			this.totalCapacity = totalCapacity;
		}
		else {
			System.out.println("Invalid!!");
		}
	}
	
	public double getUsedCapacity(){
		return usedCapacity;
	}
	
	public void setUsedCapacity(double usedCapacity){
		if(usedCapacity > 0) {
			this.usedCapacity = usedCapacity;
		}
		else {
			System.out.println("Invalid!!");
		}
	}
	
	@Override
	public String getName(){
		
		return "laptop name: Samsung";
	}
}
