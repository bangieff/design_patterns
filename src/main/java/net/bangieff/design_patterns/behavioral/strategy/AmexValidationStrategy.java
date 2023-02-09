package net.bangieff.design_patterns.behavioral.strategy;

public class AmexValidationStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreditCard creditCard) {
		boolean result = true;
				
		result = ( creditCard.getNumber().startsWith("34") ||
				   creditCard.getNumber().startsWith("37") ) &&
				   creditCard.getNumber().length() == 15 &&
				   luhnAlgorythm(creditCard.getNumber());
		
		//TODO: check expiration date
		return result; 
	}

}
