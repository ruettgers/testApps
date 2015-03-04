package com.costs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Festausgaben extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_festausgaben);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.festausgaben, menu);
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
	public void safeAmount (View view) {
		EditText input = (EditText) findViewById(R.id.Einnahme);
		String guthabenstring = input.getText().toString();
		double guthaben = Double.parseDouble(guthabenstring);
		AppContext.getInstance().setBetrag(guthaben);
	

		 Intent in = new Intent(Festausgaben.this,Rechner.class);
		 startActivity(in);
		  }

}
