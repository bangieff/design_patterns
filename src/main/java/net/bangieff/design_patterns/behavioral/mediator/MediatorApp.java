package net.bangieff.design_patterns.behavioral.mediator;

public class MediatorApp {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Light bedroomLight = new Light("Bedroom");
		Light kitchenLight = new Light("Kitchen");
		
		mediator.registerLight(bedroomLight);
		mediator.registerLight(kitchenLight);
		
		Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
		turnOnAllLightsCommand.execute();

		Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
		turnOffAllLightsCommand.execute();

	}

}
