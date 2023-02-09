package net.bangieff.design_patterns.behavioral.strategy;

public class CreditCard {
	private String number;
	private String date;
	private String ccv;
	
	private ValidationStrategy strategy;
	
	public CreditCard(ValidationStrategy strategy) {
		this.strategy = strategy;
	}
	
	public CreditCard(ValidationStrategy strategy, String number, String date, String ccv) {
		this(strategy);
		this.number = number;
		this.date = date;
		this.ccv = ccv;
	}
	
	public boolean isValid() {
		return strategy.isValid(this);
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCcv() {
		return ccv;
	}
	public void setCcv(String ccv) {
		this.ccv = ccv;
	}
	
	
}
