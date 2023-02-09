package net.bangieff.design_patterns.behavioral.strategy;

public class StrategyApp {
	public static void main(String[] args) {
		CreditCard amex1 = new CreditCard(new AmexValidationStrategy());
		CreditCard amex2 = new CreditCard(new AmexValidationStrategy());
		CreditCard visa1 = new CreditCard(new VisaValidationStrategy());
		
		amex1.setNumber("1234567890");
		amex1.setDate("01/2023");
		amex1.setCcv("142");
		
		System.out.println("Is Amex 1 valid: " + amex1.isValid());		

		amex2.setNumber("379185883464283");
		amex2.setDate("04/2023");
		amex2.setCcv("123");
		
		System.out.println("Is Amex 2 valid: " + amex2.isValid());		

		visa1.setNumber("4539589763663402");
		visa1.setDate("51/2023");
		visa1.setCcv("007");
		
		System.out.println("Is Visa 1 valid: " + visa1.isValid());		

	}

}
