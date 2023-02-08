package net.bangieff.design_patterns.behavioral.state;

public class Device {
	State deviceOffState;
	State deviceLowState;
	State deviceMedState;
	State deviceHighState;
	State state;
	
	public Device() {
		deviceOffState = new DeviceOffState(this);
		deviceLowState = new DeviceLowState(this);
		deviceMedState = new DeviceMedState(this);
		deviceHighState = new DeviceHighState(this);
		
		this.state = deviceOffState;
	}
	
	public void clickButton() {
		state.handleRequest();
	}

	public State getDeviceOffState() {
		return this.deviceOffState;
	}

	public State getDeviceLowState() {
		return this.deviceLowState;
	}

	public State getDeviceMedState() {
		return this.deviceMedState;
	}

	public State getDeviceHighState() {
		return this.deviceHighState;
	}

	public void setState(State state) {
		this.state = state;
		
	}

	public String toString() {
		return this.state.toString();
	}

}
