package com.bcp.coinserver.bean;

public class CoinRequest {

	private double amount;
	private long cointOrigin;
	private long cointDestination;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public long getCointOrigin() {
		return cointOrigin;
	}
	public void setCointOrigin(long cointOrigin) {
		this.cointOrigin = cointOrigin;
	}
	public long getCointDestination() {
		return cointDestination;
	}
	public void setCointDestination(long cointDestination) {
		this.cointDestination = cointDestination;
	}

	
	
}
