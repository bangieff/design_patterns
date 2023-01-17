package net.bangieff.design_patterns.behavioral.chain_of_responsibility;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getType() == RequestType.CONFERENCE) {
			System.out.println("Director can approve conferences");
		}
		else {
			successor.handleRequest(request);
		}
	}

}
