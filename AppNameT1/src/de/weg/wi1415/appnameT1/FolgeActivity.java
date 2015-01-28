package de.weg.wi1415.appnameT1;

import java.util.List;

import de.weg.wi1415.appnameT1.model.Name;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class FolgeActivity extends Activity {

	private ListView mainListView ;  
	private ArrayAdapter<Name> listAdapter ;  
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_folge);
 
        // 1. get passed intent 
        Intent intent = getIntent();
 
        // 2. get person object
        // aus dem Context des Application layer
        Name derName = AppContext.getInstance().getDerName();
        // alternative from intent (PResentation layer
        //Name derName = (Name) intent.getSerializableExtra("person");
 
               
        // 3. get reference to person textView 
        TextView namensFeld = (TextView) findViewById(R.id.AnredeText);
        namensFeld.setText(derName.getVorname()+" "+derName.getNachname());
        
        
       //Liste verarbeiten
        List<Name> namensliste= AppContext.getInstance().getNamensListe();
        // Find the ListView resource.   
        mainListView = (ListView) findViewById( R.id.listeDerNamen);  
          
        // Create ArrayAdapter using the list.  
        listAdapter = new ArrayAdapter<Name>(this, R.layout.list_item_name, namensliste);  
        //ArrayAdapterName listAdapter = new ArrayAdapterName(this, contacts);
          
                      
        // Set the ArrayAdapter as the ListView's adapter.  
        mainListView.setAdapter( listAdapter );        
 
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.folge, menu);
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
		 Intent in = new Intent(FolgeActivity.this,MainActivity.class);
		 startActivity(in);
		 }
	 
	 public void goForward(View view) {
		 Intent in = new Intent(FolgeActivity.this,EndActivity.class);
		 startActivity(in);
		 }

	 
}
