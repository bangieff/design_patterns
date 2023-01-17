package net.bangieff.design_patterns.behavioral.chain_of_responsibility;

public class Request {
	private RequestType type;
	private double amount;
	
	public Request(RequestType type, double amount) {
		this.type = type;
		this.amount = amount;
	}
	
	public RequestType getType() {
		return this.type;
	}
	
	public double getAmount() {
		return this.amount;
	}
}
