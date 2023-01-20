package net.bangieff.design_patterns.behavioral.observer;

public class TabletClient extends Observer {
	public TabletClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void addMessage(String message) {
		subject.setState("[Tablet]: " + message);
	}

	@Override
	void update() {
		System.out.println("[Tablet Stream]: " + subject.getState());
	}
	
}
