package net.bangieff.design_patterns.behavioral.chain_of_responsibility;

public class ChainOfResponsibility {

	public static void main(String[] args) {
		Director al = new Director();
		Vp john = new Vp();
		Ceo pete = new Ceo();
		
		al.setSuccessor(john);
		john.setSuccessor(pete);
		
		Request request = new Request(RequestType.CONFERENCE, 500);
		al.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 500);
		al.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		al.handleRequest(request);

	}

}
