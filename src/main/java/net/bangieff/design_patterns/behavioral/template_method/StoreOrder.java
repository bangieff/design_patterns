package net.bangieff.design_patterns.behavioral.template_method;

public class StoreOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Store Checkout");
	}

	@Override
	public void doPayment() {
		System.out.println("Store Payment");
	}

	@Override
	public void doReceipt() {
		System.out.println("Store Receipt print");

	}

	@Override
	public void doDelivery() {
		System.out.println("Store Bag Items");
	}


}
