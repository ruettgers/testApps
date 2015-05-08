package de.weg.projekt.winf135.aufgabenapp;

import java.util.ArrayList;
import java.util.List;

import de.weg.projekt.winf135.aufgabenapp.model.Aufgabe;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AufgabeHinzuActivity extends Activity {
	
	/*SQLiteDatabase AufgabenDatenbank;
	TextView name1,beschreibung1;
	Button speichern;
	EditText name,beschreibung,ed1;
	String aufgabeneingabe;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aufgabe_hinzu);
		AufgabenDatenbank=openOrCreateDatabase("Aufgaben-Datenbank",MODE_PRIVATE, null);
		AufgabenDatenbank.execSQL("CREATE TABLE IF NOT EXISTS aufgabe (aufgabeneingabedb VARACHAR;");
		
		speichern.findViewById(R.id.button1);
		name.findViewById(R.id.editText1);
		beschreibung.findViewById(R.id.editText2);
		name.addTextChangedListener(new TextWatcher(){

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				speichern.setEnabled(s.length()>0);
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				
			}});
		speichern.setEnabled(false);
	}
	private void eintraghinzu (View view){
		ed1.findViewById(R.id.editText1);
		aufgabeneingabe = ed1.getText().toString();
		AufgabenDatenbank.execSQL("INSERT INTO Text VALUES('"+aufgabeneingabe+"');");
	}
	private void eintraganzeigen (View view){
		Cursor cursor = AufgabenDatenbank.rawQuery("SELECT *from Text", null);
	}*/

	List<String> AufgabenListe = new ArrayList<String>();

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.aufgabe_hinzu, menu);
		return true;
	}

	public void Eintrag(View view) {
		int Name;
		int Beschreibung;
		EditText NameEintrag = (EditText) findViewById(R.id.editText1);
		EditText BeschreibungEintrag = (EditText) findViewById(R.id.editText2);
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void goListeSpeichern(View view) {
		//Lesen der Eingabedaten
		Aufgabe dieAufgabe = new Aufgabe();
		EditText nameEintrag = (EditText) findViewById(R.id.editText1);
		dieAufgabe.setName(nameEintrag.getText().toString());
		EditText beschreibungEintrag = (EditText) findViewById(R.id.editText2);
		dieAufgabe.setBeschreibung(beschreibungEintrag.getText().toString());
		
		
		// Prüfe die Eingabe evt. zurück
		if (dieAufgabe.getName().length() <= 2)
		{
	        Toast.makeText(this, "Bitte einen vernünftigen Namen eingeben.",Toast.LENGTH_LONG).show();
			        return;
		}

		// Merke die Eingabe in der Liste
		AppContext.getInstance().getAufgabenListe().add(dieAufgabe);
		
		
		
		// Wechsel der Sicht
		Intent in = new Intent(AufgabeHinzuActivity.this, ListeActivity.class);
		startActivity(in);
		Toast.makeText(this, "Aufgabe wurde gespeichert!", Toast.LENGTH_SHORT)
				.show();
	}
	
}
