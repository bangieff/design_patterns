package net.bangieff.design_patterns.behavioral.visitor;

public class AtvPartsShippingVisitor implements AtvPartVisitor {
	double shippingAmount = 0;
	
	@Override
	public void visit(Fender part) {
		shippingAmount += 4;
		System.out.println("Fender is a small package...");
	}

	@Override
	public void visit(Oil part) {
		shippingAmount += 9;
		System.out.println("Oil is hazardous...");
	}

	@Override
	public void visit(Wheel part) {
		shippingAmount += 15;
		System.out.println("Wheels are bulky and expensive to ship...");
	}

	@Override
	public void visit(PartsOrder order) {
		if(order.getParts().size() > 3) {
			System.out.println("Discount for more than 3 items");
			shippingAmount -= 5;			
		}
		System.out.println("Shipping amount is: " + shippingAmount);
	}

}
