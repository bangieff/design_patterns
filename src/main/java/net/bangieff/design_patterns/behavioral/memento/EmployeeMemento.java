package net.bangieff.design_patterns.behavioral.memento;

//memento
public class EmployeeMemento {
	private String name;
	//for the example we don't care about the address
	private String phone;
	
	public EmployeeMemento(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
	
}
