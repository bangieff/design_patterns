package net.bangieff.design_patterns.behavioral.mediator;

//receiver
public class Light {
	private boolean isOn = false;
	private String location = "";
	
	public Light(String location ) {
		this.location = location;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public void toggle() {
		if(isOn()) {
			off();
		}
		else {
			on();
		}
	}
	
	public void on() {
		this.isOn = true;
		System.out.println(location + " is on!");
	}
	public void off() {
		this.isOn = false;
		System.out.println(location + " is off!");
	}
}
