package de.weg135.winf.passwordapp1;

import java.util.List;


import de.weg135.winf.passwordapp1.modell.Account;
import de.weg135.winf.passwordapp1.modell.AccountAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class AlleAccounts extends Activity {

	private ListView mainListView;
	private AccountAdapter listAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alle_accounts);
		
	       //Liste verarbeiten
        List<Account> liste= AppContext.getInstance().getAccountListe();
        // Find the ListView resource.   
        mainListView = (ListView) findViewById( R.id.listeDerAccounts);  
          
        // Create ArrayAdapter using the list.  
        listAdapter = new AccountAdapter(this, liste);  
                      
        // Set the ArrayAdapter as the ListView's adapter.  
        mainListView.setAdapter( listAdapter );        
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alle_accounts, menu);
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
	
	public void goBack(View view) {

		 Intent in = new Intent(AlleAccounts.this,HauptMenu.class);
		 startActivity(in);
		 
		  }



}
