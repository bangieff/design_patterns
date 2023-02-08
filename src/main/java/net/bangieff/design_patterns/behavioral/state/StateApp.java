package net.bangieff.design_patterns.behavioral.state;

public class StateApp {

	
	public static void main(String[] args) {
		Device device = new Device();
		
		for(int i = 0; i< 10 ; i++) {
			System.out.println(device.toString());
			device.clickButton();
		}
	}
	


}
