package net.bangieff.design_patterns.behavioral.state;

public class DeviceHighState extends State {
	public DeviceHighState(Device device) {
		this.device = device;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Turning the device OFF");
		this.device.setState(device.getDeviceOffState());
	}
	
	public String toString() {
		return "Device is set to High!";
	}
}
