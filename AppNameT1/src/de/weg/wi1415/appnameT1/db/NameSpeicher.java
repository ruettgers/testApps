package de.weg.wi1415.appnameT1.db;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import de.weg.wi1415.appnameT1.model.Name;

public class NameSpeicher implements Serializable   {

	
	//Singleton
	private static NameSpeicher DerNameSpeicher = new NameSpeicher();
	public static NameSpeicher getInstance()
	{
		return DerNameSpeicher;
	}

	
	public void ladeAlle(java.util.List<Name> nl)
	{

           
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
