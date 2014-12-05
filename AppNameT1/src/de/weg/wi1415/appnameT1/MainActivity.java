package de.weg.wi1415.appnameT1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	
	 public void onClickButton1(View view) {
		 Button b= (Button) findViewById(R.id.button1);
		 showSalve(b.getText());
		  }
	 public void onClickButton2(View view) {
		 Button b= (Button) findViewById(R.id.button2);
		 showSalve(b.getText());
		  }
	 public void goForward(View view) {
		 Intent in = new Intent(MainActivity.this,FolgeActivity.class);
		 startActivity(in);
		  }

	private void showSalve(CharSequence charSequence) {
		EditText input = (EditText) findViewById(R.id.editText1);
		String string = input.getText().toString();
		if (string.length() <= 2)
		{
	        Toast.makeText(this, "Bitte einen vernünftigen Namen eingeben.",Toast.LENGTH_LONG).show();
			        return;
		}
		
		
		TextView anzeige = (TextView) findViewById(R.id.textView1);
		anzeige.setText("Guten Tag "+ charSequence + " " + string);
		
	}
	 
}
