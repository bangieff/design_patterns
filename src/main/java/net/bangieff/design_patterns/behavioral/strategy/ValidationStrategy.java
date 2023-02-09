package net.bangieff.design_patterns.behavioral.strategy;

public abstract class ValidationStrategy {
	public abstract boolean isValid(CreditCard creditCard);
	
	//standard algorythm for CC number validation
	protected boolean luhnAlgorythm(String number) {
		int sum = 0;
		boolean alternate = false;
		for(int i = number.length() - 1; i>=0; i--) {
			int n = Integer.parseInt(number.substring(i, i+1));
			if(alternate) {
				n *= 2;
				if(n > 9) {
					n = (n % 10) + 1;
				}
			}
			sum += n;
			alternate = !alternate;
		}
		return (sum%10 == 0);
	}
}
