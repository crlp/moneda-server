package com.bcp.coinserver.bean;

import java.io.Serializable;

import com.bcp.coinserver.entity.Coin;

public class CoinOut implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	private double amountTotal;
	private Coin cointOrigin;
	private Coin cointDestination;
	
	public CoinOut(double amount, double amountTotal, Coin cointOrigin, Coin cointDestination) {
		super();
		this.amount = amount;
		this.amountTotal = amountTotal;
		this.cointOrigin = cointOrigin;
		this.cointDestination = cointDestination;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmountTotal() {
		return amountTotal;
	}
	public void setAmountTotal(double amountTotal) {
		this.amountTotal = amountTotal;
	}
	public Coin getCointOrigin() {
		return cointOrigin;
	}
	public void setCointOrigin(Coin cointOrigin) {
		this.cointOrigin = cointOrigin;
	}
	public Coin getCointDestination() {
		return cointDestination;
	}
	public void setCointDestination(Coin cointDestination) {
		this.cointDestination = cointDestination;
	}
	
	
}
