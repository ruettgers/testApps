package de.weg.wi1415.appnameT1;

import de.weg.wi1415.appnameT1.logicalLayer.Name;

public class AppContext {
	
	private static AppContext instance = new AppContext();
	public static AppContext getInstance() {
		return instance;
	}

	java.util.List<Name> namensListe = new java.util.ArrayList<Name>();
	public java.util.List<Name> getNamensListe() {
		return namensListe;
	}


	private Name derName = Name.derLeereName;
	public Name getDerName() {
		return derName;
	}
	public void setDerName(Name neuerName) {
		this.derName = neuerName;
	}
	

}
