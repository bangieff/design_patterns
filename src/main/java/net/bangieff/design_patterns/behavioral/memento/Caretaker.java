package net.bangieff.design_patterns.behavioral.memento;

import java.util.Stack;

//caretaker
public class Caretaker {
	private Stack<EmployeeMemento> employeeHistory = new Stack<>();
	
	public void save(Employee emp) {
		employeeHistory.push(emp.save());
	}
	public void revert(Employee emp) {
		emp.revert(employeeHistory.pop());
	}
}
