package de.weg.wi1415.appnameT1.logicalLayer;

import java.io.Serializable;

public class Name implements Serializable   {

	private static final long serialVersionUID = 1L;
	public static Name derLeereName = new Name();
	public static Name getDerLeereName() {
		return derLeereName;
	}

	public static boolean isDerLeereName(Name derName)
	{
		return derName.equals(derLeereName);
	}	
	public static Name kopiere(Name zuKopiernderName)
	{
		Name kopie = new Name();
		kopie.setNachname(zuKopiernderName.getNachname());
		kopie.setVorname(zuKopiernderName.getVorname());
		return kopie;

	}
	
	String nachname="";
	String vorname="";

		public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

		public String getNachname() {
			return nachname;
		}

		public void setNachname(String nachname) {
			this.nachname = nachname;
		}
		
		
}
