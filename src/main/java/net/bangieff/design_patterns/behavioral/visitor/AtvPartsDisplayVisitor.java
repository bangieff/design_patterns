package net.bangieff.design_patterns.behavioral.visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

	@Override
	public void visit(Wheel part) {
		System.out.println("We have a wheel");

	}

	@Override
	public void visit(Oil part) {
		System.out.println("We have an oil");
	}

	@Override
	public void visit(Fender part) {
		System.out.println("We have a fender");
	}

	@Override
	public void visit(PartsOrder partsOrder) {
		System.out.println("We have an order");
	}

}
