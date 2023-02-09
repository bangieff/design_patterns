package net.bangieff.design_patterns.behavioral.visitor;

public class VisitorApp {
	
	public static void main(String[] parameters) {
		PartsOrder order = new PartsOrder();
		
		order.addPart(new Wheel());
		order.addPart(new Fender());
		order.addPart(new Oil());
		order.addPart(new Wheel());
		
		order.accept(new AtvPartsShippingVisitor());
		order.accept(new AtvPartsDisplayVisitor());
	}
}
