package net.bangieff.design_patterns.behavioral.observer;

public class ObserverApp {

	public static void main(String[] args) {
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);
		
		phoneClient.addMessage("Hello!");
		tabletClient.addMessage("Hya!");

	}

}
