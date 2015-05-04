package de.weg.projekt.winf135.aufgabenapp;


import java.util.List;

import de.weg.projekt.winf135.aufgabenapp.model.ArrayAdapterAufgabe;
import de.weg.projekt.winf135.aufgabenapp.model.Aufgabe;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class ListeActivity extends Activity {

	private ListView mainListView;
	private ArrayAdapterAufgabe listAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_liste);
		
	       //Liste verarbeiten
        List<Aufgabe> liste= AppContext.getInstance().getAufgabenListe();
        // Find the ListView resource.   
        mainListView = (ListView) findViewById( R.id.listeaufgabe);  
          
        // Create ArrayAdapter using the list.  
        listAdapter = new ArrayAdapterAufgabe(this, liste);  
                      
        // Set the ArrayAdapter as the ListView's adapter.  
        mainListView.setAdapter( listAdapter );        

		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.liste, menu);
		return true;
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
	
	public void goHinzu(View view) {
		 Intent in = new Intent(ListeActivity.this,AufgabeHinzuActivity.class);
		 startActivity(in);
		 }
}
