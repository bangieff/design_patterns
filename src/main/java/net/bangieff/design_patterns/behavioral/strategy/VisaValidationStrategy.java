package net.bangieff.design_patterns.behavioral.strategy;

public class VisaValidationStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean result = true;
				
		result = creditCard.getNumber().startsWith("4") &&
				 creditCard.getNumber().length() == 16 &&
				 luhnAlgorythm(creditCard.getNumber());
		
		//TODO: check expiration date
		
		return result; 
	}

}
