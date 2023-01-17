package net.bangieff.design_patterns.behavioral.chain_of_responsibility;

public class Vp extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getType() == RequestType.PURCHASE && request.getAmount() < 750) {
			System.out.println("VP can approve purchases below 750");
		}
		else {
			successor.handleRequest(request);
		}
	}

}
