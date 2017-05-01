package kr_ac_ajou;

public abstract class SmartTV extends product implements Networked {
	private int channel;
	
	public int getchannel() {
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
		
	}
	
	public double maxSpeed() {
		
	}
	
	public String getName() {
		
	}
}
