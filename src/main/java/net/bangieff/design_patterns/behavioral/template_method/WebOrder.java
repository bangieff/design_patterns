package net.bangieff.design_patterns.behavioral.template_method;

public class WebOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Web Checkout");
	}

	@Override
	public void doPayment() {
		System.out.println("Web Payment");
	}

	@Override
	public void doReceipt() {
		System.out.println("Web Receipt sent over email");

	}

	@Override
	public void doDelivery() {
		System.out.println("Web Delivery");
	}

}
