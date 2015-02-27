package de.weg.wi1415.appnameT1.db;

import java.io.Serializable;

import de.weg.wi1415.appnameT1.AppContext;
import de.weg.wi1415.appnameT1.model.Name;

public class NameSpeicher implements Serializable  {


	private static final long serialVersionUID = 1L;
	//Singleton
	private static NameSpeicher DerNameSpeicher = new NameSpeicher();
	public static NameSpeicher getInstance()
	{
		return DerNameSpeicher;
	}

	
	public void ladeAlle(java.util.List<Name> nl1)
	{

		Name derName;
		derName = new Name();
		derName.setNachname("Test1");
		derName.setVorname("Vor1");
		nl1.add(derName);
		derName = new Name();
		derName.setNachname("Test2");
		derName.setVorname("Vor2");
		nl1.add(derName);
		derName = new Name();
		derName.setNachname("Test3");
		derName.setVorname("Vor3");
		nl1.add(derName);
		derName = new Name();
		derName.setNachname("Test4");
		derName.setVorname("Vor4");
		nl1.add(derName);
		for(int i=5; i<10; i++)
		{
			derName = new Name();
			derName.setNachname("Test"+i);
			derName.setVorname("Vor"+i);
			nl1.add(derName);
		}
           
/*            while (in != null) {
                String[] line = in.split(";");
                Name name = new Name();
                name.setVorname(line[0]);
                name.setNachname(line[1]);
                               
                nl.add(name);
                in = read.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
*/	}
	
	public void speicherAlle(java.util.List<Name> nl)
	{
	
/*			try {
			    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			        for (Name name:nl) {
			              writer.write(name.getVorname() );
			              writer.write(";");
			              writer.write(name.getNachname());
			              writer.newLine();

			         }
			         writer.close();
			 
			}
			catch (IOException e) {
			e.printStackTrace();
			}
*/
	}


}
