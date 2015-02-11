package de.weg.wi1415.appnameT1;

import java.util.Collections;

import de.weg.wi1415.appnameT1.db.NameSpeicher;
import de.weg.wi1415.appnameT1.model.Name;

public class AppContext {
	
	private static AppContext instance = null;
	
	private java.util.List<Name> namensListe= null;
	private Name derName = Name.derLeereName;

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
		NameSpeicher.getInstance().ladeAlle(namensListe);
		Collections.sort(namensListe);
		
	}

	public java.util.List<Name> getNamensListe() {
		Collections.sort(namensListe);
		return namensListe;
	}


	public Name getDerName() {
		return derName;
	}
	public void setDerName(Name neuerName) {
		derName = neuerName;
	}
	

}
