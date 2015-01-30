package de.weg.wi1415.appnameT1.db;

import java.io.Serializable;

import de.weg.wi1415.appnameT1.model.Name;

public class NameSpeicher implements Serializable   {

	private static final long serialVersionUID = 1L;

	public static void ladeAlle(java.util.List<Name> nl)
	{
	
		Name derName;
		derName = new Name();
		derName.setNachname("aTest1");
		derName.setVorname("Vor1");
		nl.add(derName);
		derName = new Name();
		derName.setNachname("bTest2");
		derName.setVorname("Vor2");
		nl.add(derName);
		derName = new Name();
		derName.setNachname("cTest3");
		derName.setVorname("Vor3");
		nl.add(derName);
		derName = new Name();
		derName.setNachname("dTest4");
		derName.setVorname("Vor4");
		nl.add(derName);
		for(int i=5; i<10; i++)
		{
			derName = new Name();
			derName.setNachname("Test"+i);
			derName.setVorname("Vor"+i);
			nl.add(derName);
		}

	}
	
		
}
