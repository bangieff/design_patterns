package net.bangieff.design_patterns.behavioral.state;

public class DeviceLowState extends State {
	public DeviceLowState(Device device) {
		this.device = device;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Turning the device to Medium");
		this.device.setState(device.getDeviceMedState());
	}
	
	public String toString() {
		return "Device is set to LOW!";
	}
}
