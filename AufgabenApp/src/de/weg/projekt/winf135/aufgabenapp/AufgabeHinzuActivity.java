package de.weg.projekt.winf135.aufgabenapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AufgabeHinzuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aufgabe_hinzu);
	}
	
	List<String> AufgabenListe = new ArrayList<String>();

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.aufgabe_hinzu, menu);
		return true;
	}

	public void Eintrag (View view){
	int Name;
	int Beschreibung;
	EditText NameEintrag = (EditText)findViewById(R.id.editText1);
	EditText BeschreibungEintrag = (EditText)findViewById(R.id.editText2);
	}
	//AufgabenListe.add(object)--> in geschweifte klammer von oben rein
	//mit if: wenn eintragung gemacht und tippt auf speichern dann werte in liste speichern
	
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
		 Intent in = new Intent(AufgabeHinzuActivity.this,ListeActivity.class);
		 startActivity(in);
		 Toast.makeText(this, "Aufgabe wurde gespeichert!" , Toast.LENGTH_SHORT).show();
		 }
}
