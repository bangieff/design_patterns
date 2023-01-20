package net.bangieff.design_patterns.behavioral.observer;

public abstract class Observer {
	protected Subject subject;
	
	abstract void update();
}
