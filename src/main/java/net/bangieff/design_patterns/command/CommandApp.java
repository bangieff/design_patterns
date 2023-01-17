package net.bangieff.design_patterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandApp {
	public static void main(String args[]) {
		Light kitchenLight = new Light();
		Light bedroomLight = new Light();
		Light bathroomLight = new Light();
		List<Light> allLights = new ArrayList<>();
		
		Switch lightSwitch = new Switch();

		Command toggleCommand = new ToggleCommand(kitchenLight);
		lightSwitch.storeAndExecute(toggleCommand);

		Command allLightsCommand = new AllLightsCommand(allLights);
		
		allLights.add(kitchenLight);
		allLights.add(bedroomLight);
		allLights.add(bathroomLight);
		
		lightSwitch.storeAndExecute(allLightsCommand);
	}
}
