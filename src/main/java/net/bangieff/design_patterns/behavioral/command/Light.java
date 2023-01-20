package net.bangieff.design_patterns.behavioral.command;

public class Light {
	private boolean isOn = false;
	
	public void toggle() {
		if(this.isOn) {
			this.off();
		}
		else {
			this.on();
		}
	}
	
	public void on() {
		this.isOn = true;
		System.out.println("Light switched on.");
	}
	
	public void off() {
		this.isOn = false;
		System.out.println("Light switched off.");
	}
	
	public boolean isOn() {
		return isOn;
	}
}
