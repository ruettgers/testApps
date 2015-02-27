package de.weg.wi1415.appnameT1.model;

import java.io.Serializable;

public class Name implements Serializable, Comparable<Name>   {

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

		@Override
		public int compareTo(Name otherName) {
			
			int c = this.getNachname().compareToIgnoreCase(otherName.getNachname());
			if (c!=0)
			{
				return c;
			}
			return this.getVorname().compareToIgnoreCase(otherName.getVorname());

		}
		
		
}
