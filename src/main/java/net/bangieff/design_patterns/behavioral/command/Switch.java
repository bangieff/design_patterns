package net.bangieff.design_patterns.behavioral.command;

//invoker
public class Switch {
	public void storeAndExecute(Command command) {
		command.execute();
	}
}
