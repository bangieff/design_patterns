package net.bangieff.design_patterns.behavioral.state;

public abstract class State {
	protected Device device;

	public abstract void handleRequest();
}
