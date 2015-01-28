package de.weg.wi1415.appnameT1;

import de.weg.wi1415.appnameT1.db.NameSpeicher;
import de.weg.wi1415.appnameT1.model.Name;

public class AppContext {
	
	private static AppContext instance = new AppContext();
	private AppContext()
	{
		NameSpeicher.ladeAlle();
	}
	public static AppContext getInstance() {
		return instance;
	}

	private java.util.List<Name> namensListe = new java.util.ArrayList<Name>();
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
