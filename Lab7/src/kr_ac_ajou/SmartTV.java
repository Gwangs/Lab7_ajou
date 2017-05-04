package kr_ac_ajou;

public class SmartTV extends Product implements Networked {
private int channel;
	
	public int getchannel() {
		if(channel == 5) {
			System.out.println("Channel " +channel+ " is SBS.");
		}
		else if(channel == 7) {
			System.out.println("Channel " +channel+ " is KBS1.");
		}
		else if(channel == 9) {
			System.out.println("Channel " +channel+ " is KBS2.");
		}
		else if(channel == 11) {
			System.out.println("Channel " +channel+ " is MBC.");
		}
		else if(channel < 15) {
			System.out.println("Channel " +channel+ " is showing Shopping Channel.");
		}
		else if(channel < 25) {
			System.out.println("Channel " +channel+ " is showing News Channel.");
		}
		else {
			System.out.println("This channel is Prenium Channel. You Should pay for this channel.");
		}
		return channel;
	}
	
	public void setchannel(int cha) {
		if(cha > 0) {
			this.channel = cha;
		}
		else {
			System.out.println("Invalid!!");
		}
	}
	
	public boolean isConnected() {
		boolean Istrue = true;
		System.out.println("Smart TV Internet Connection Condition : " +Istrue);
		return true;
	}
	
	public double maxSpeed() {
		double max = 70.50;
		double ping = 0.005;
		System.out.println();
		System.out.println("Now Checking internet conditon");
		
		
		System.out.println("Internet Speed: " +max+ " Mbps");
		System.out.println("Ping: " +ping+ " Seconds");
		if(max > 30) {
			System.out.println("Internet Speed Condition : OK");
		}
		if(max > 70) {
			System.out.println("Speed is fine. it is showing fastest Condition.");
		}
		if(ping < 0.05) {
			System.out.println("There is no delay in internet.");
		}
		System.out.println();
		return max;
	}
	
	public String getName() {
		System.out.println("Name of the Smart Television: LG SmartTV");
		return "Smart TV";
	}
}
