package de.weg.wi.eingabetest;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	 public void onClickHerr(View v) {
		 
		 eingabeVerarbeiten(getString(R.string.textButtonHerr));
		 
	 }
	 public void onClickFrau(View v) {
		 
		 eingabeVerarbeiten(getString(R.string.textButtonFrau));		 
	 }
	 
	private void eingabeVerarbeiten(String geschlecht) {
		// hole den text zur ID editText1
		 EditText nameField = (EditText) findViewById(R.id.editText1);
		 String name = nameField.getText().toString();
		 
		 //check ob ein name eingegeben wurde
		 if (name.length()<3)
		 {
			 new AlertDialog.Builder(this).setMessage(
	                    R.string.error_name_missing).setNeutralButton(
	                    R.string.error_ok,
	                    null).show();
	            return;
 
		 }
		 
		 // schreibe den Text in die textView1  davor soll der Gruß und die Anrede stehen
		 //Bsp: -Guten Tag- -Herr- -Name-
		 String ausgabe = getString(R.string.gutenTag)+ " " + geschlecht+ " " + name;
		 TextView ausgabeField = (TextView) findViewById(R.id.textView1);
		 ausgabeField.setText(ausgabe);
	}
	 

	 
	
}
