package net.bangieff.design_patterns.behavioral.memento;

public class MementoApp {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		
		Employee emp = new Employee();
		emp.setName("John Doe");
		emp.setAddress("42, Sesame Street");
		emp.setPhone("123-456-7890");
		caretaker.save(emp);	
		System.out.println("employee before save:\t" + emp);
		
		emp.setPhone("111-222-3333");
		caretaker.save(emp);
		System.out.println("employee after change1:\t" + emp);

		emp.setPhone("111-222-0000"); //we haven't saved this one
		System.out.println("employee after change2:\t" + emp);
		
		caretaker.revert(emp);
		System.out.println("employee after revert1:\t" + emp);
		
		caretaker.revert(emp);
		System.out.println("employee after revert2:\t" + emp);

	}

}
