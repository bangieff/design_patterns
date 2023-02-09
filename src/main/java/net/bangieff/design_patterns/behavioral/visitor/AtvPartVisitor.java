package net.bangieff.design_patterns.behavioral.visitor;

public interface AtvPartVisitor {

	void visit(Wheel part);
	void visit(Oil part);
	void visit(Fender part);

	void visit(PartsOrder partsOrder);

}
