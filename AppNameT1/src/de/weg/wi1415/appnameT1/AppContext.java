package de.weg.wi1415.appnameT1;

import java.util.Collections;

import de.weg.wi1415.appnameT1.db.NameSpeicher;
import de.weg.wi1415.appnameT1.model.Name;

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
		NameSpeicher.getInstance().ladeAlle(namensListe);
		Collections.sort(namensListe);
		
	}


	private java.util.List<Name> namensListe= new java.util.ArrayList<Name>();
	public java.util.List<Name> getNamensListe() {
		Collections.sort(namensListe);
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
