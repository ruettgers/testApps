package com.costs;

public class AppContext {
	private static AppContext instance = new AppContext ();
	public static AppContext getInstance()
	{
	return instance;
	}
	private double betrag = 0;
	public double getBetrag() {
		return betrag;
	}
	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}
	public void bucheEinnahme(double income) {
		this.betrag = this.betrag+income;
	}
	public void bucheAusgabe(double outlay) {
		this.betrag = this.betrag-outlay;
	}
}
