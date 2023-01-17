package net.bangieff.design_patterns.behavioral.chain_of_responsibility;

public class Ceo extends Handler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEO can approve anything!");
	}

}
