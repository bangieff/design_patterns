package net.bangieff.design_patterns.behavioral.state;

public class DeviceMedState extends State {
	public DeviceMedState(Device device) {
		this.device = device;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Turning the device to High");
		this.device.setState(device.getDeviceHighState());
	}
	
	public String toString() {
		return "Device is set to Medium!";
	}
}
