package de.weg135.winf.passwordapp1;

import java.util.jar.Attributes.Name;

import de.weg135.winf.passwordapp1.modell.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AccountErstellen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_account_erstellen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.account_erstellen, menu);
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

		Intent in = new Intent(AccountErstellen.this, HauptMenu.class);
		startActivity(in);

	}

	public void goSpeichern(View view) {

		// Daten behalten
		Account derAccount = new Account();

		// Daten lesen
		EditText input = (EditText) findViewById(R.id.editText3);
		String name = input.getText().toString();
		derAccount.setName(name);

		input = (EditText) findViewById(R.id.editText1);
		String benutzername = input.getText().toString();
		derAccount.setBenutzername(benutzername);

		input = (EditText) findViewById(R.id.editText2);
		String passwort = input.getText().toString();
		derAccount.setPasswort(passwort);

		input = (EditText) findViewById(R.id.editText4);
		String anmerkungen = input.getText().toString();
		derAccount.setAnmerkungen(anmerkungen);

		// Prüfe die Eingabe eventuell wieder zurück auf den aktuellen Screen
		if (name.length() <= 2) {
			Toast.makeText(this, "Bitte ändern! :P", Toast.LENGTH_LONG).show();
			return;
		}

		// Merke die Eingabe in der Liste
		AppContext.getInstance().getAccountListe().add(derAccount);

		// Wechsle die Ansicht
		Intent in = new Intent(AccountErstellen.this, AlleAccounts.class);
		startActivity(in);

	}

}
