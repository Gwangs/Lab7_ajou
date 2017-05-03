package kr_ac_ajou;

public class Laptop extends Product implements Networked{
	private double totalCapacity;
	private double usedCapacity;
	
	
	public double getFreeCapacity(){
		return getFreeCapacity();
	}
	
	public void format(){
		format();
	}
	
	@Override
	public boolean isConnected(){
		return isConnected();
	}
	
	@Override
	public double maxSpeed(){

		return maxSpeed();

	}
	
	public double getTotalCapacity(){
		return totalCapacity;
	}
	
	public void setTotalCapacity(double totalCapacity){
		this.totalCapacity = totalCapacity;
	}
	
	public double getUsedCapacity(){
		return usedCapacity;
	}
	
	public void setUsedCapacity(double usedCapacity){
		this.usedCapacity = usedCapacity;
	}
	
	@Override
	public String getName(){
		return "Laptop name: "+getName();
	}
}
