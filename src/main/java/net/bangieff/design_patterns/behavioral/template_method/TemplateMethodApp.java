package net.bangieff.design_patterns.behavioral.template_method;

public class TemplateMethodApp {

	public static void main(String[] args) {
		System.out.println("Web Order:");
		
		OrderTemplate webOrder = new WebOrder();
		webOrder.processOrder();
		
		System.out.println();
		System.out.println("Store Order:");

		OrderTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
	}

}
