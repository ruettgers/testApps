package de.weg135.winf.passwordapp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ErstesMalOeffnen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_erstes_mal_oeffnen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.erstes_mal_oeffnen, menu);
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


	public void goForward(View view) {

		 Intent in = new Intent(ErstesMalOeffnen.this,HauptMenu.class);
		 startActivity(in);
		 
		  }

	public void fenster (View view){
		
		EditText Feld1 = (EditText)findViewById (R.id.editText1);
		EditText Feld2 = (EditText)findViewById (R.id.editText2);
		
		
		if (Feld1.getText().toString() == Feld2.getText().toString())
	{
        Toast.makeText(this, "Perfekt",Toast.LENGTH_LONG).show();
		        return;
	} 
	
	

	}
	
}
