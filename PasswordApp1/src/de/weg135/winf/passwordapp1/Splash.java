package de.weg135.winf.passwordapp1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread backround = new Thread() {
			public void run() {

				try {
					// 4 sekunden
					sleep(4001);

					// nach 4 sec ins nächste layout
					Intent in = new Intent(Splash.this, ErstesMalOeffnen.class);
					startActivity(in);

					finish();

				} catch (Exception e) {

				}

			}

		};

		backround.start();
	}

}
