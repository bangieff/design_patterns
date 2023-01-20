package net.bangieff.design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	abstract void setState(String state);
	abstract String getState();
	
	public void attach(Observer obs) {
		observers.add(obs);
	}
	
	public void detach(Observer obs) {
		observers.remove(obs);
	}
	
	public void notifyObservers() {
		for(Observer obs : observers) {
			obs.update();
		}
	}
}
