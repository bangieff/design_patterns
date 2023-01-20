package net.bangieff.design_patterns.behavioral.observer;

public class PhoneClient extends Observer {
	public PhoneClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void addMessage(String message) {
		subject.setState("[Phone]: " + message);
	}

	@Override
	void update() {
		System.out.println("[Phone Stream]: " + subject.getState());
	}
	
}
