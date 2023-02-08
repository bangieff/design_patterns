package net.bangieff.design_patterns.behavioral.state;

public class DeviceOffState extends State {
	public DeviceOffState(Device device) {
		this.device = device;
	}
	
	@Override
	public void handleRequest() {
		System.out.println("Turning the device to Low");
		this.device.setState(device.getDeviceLowState());
	}
	
	public String toString() {
		return "Device is OFF!";
	}
}
