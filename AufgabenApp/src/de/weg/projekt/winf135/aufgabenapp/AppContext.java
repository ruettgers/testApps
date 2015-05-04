package de.weg.projekt.winf135.aufgabenapp;

import de.weg.projekt.winf135.aufgabenapp.model.Aufgabe;


public class AppContext {
	

	private static AppContext instance = new AppContext();
	private AppContext()
	{
		this.init();
	}
	public static AppContext getInstance() {
		return instance;
	}
	public void init() {
		//Collections.sort(aufgabenListe);
		
	}


	private java.util.List<Aufgabe> aufgabenListe= new java.util.ArrayList<Aufgabe>();
	public java.util.List<Aufgabe> getAufgabenListe() {
		//Collections.sort(aufgabenListe);
		return aufgabenListe;
	}



}
