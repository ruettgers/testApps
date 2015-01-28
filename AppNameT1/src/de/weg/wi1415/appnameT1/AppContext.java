package de.weg.wi1415.appnameT1;

import de.weg.wi1415.appnameT1.db.NameSpeicher;
import de.weg.wi1415.appnameT1.model.Name;

public class AppContext {
	
	private static AppContext instance = null;
	private AppContext()
	{
	}
	public static AppContext getInstance() {
		if (instance == null)
		{
			instance = new AppContext();
			instance.init();
		}
		return instance;
	}
	public void init() {
		namensListe = new java.util.ArrayList<Name>();
		NameSpeicher.ladeAlle(namensListe);
		
	}

	private java.util.List<Name> namensListe= null;
	public java.util.List<Name> getNamensListe() {
		return namensListe;
	}


	private Name derName = Name.derLeereName;
	public Name getDerName() {
		return derName;
	}
	public void setDerName(Name neuerName) {
		derName = neuerName;
	}
	

}
