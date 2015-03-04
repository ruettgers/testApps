package de.weg.projekt.winf135.aufgabenapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivitiy extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		 Thread background = new Thread() {
	            public void run() {
	                 
	                try {
	                    // Thread will sleep for 4 seconds
	                    sleep(4*1000);
	                     
	                    // After 4 seconds redirect to another intent
	                    Intent in = new Intent(SplashActivitiy.this,MainActivity.class);
	           		    startActivity(in);
	                     
	                    //Remove activity
	                    finish();
	                     
	                } catch (Exception e) {
	                 
	                }
	            }
	        };
	         
	        // start thread
	        background.start();

		
		
	
	}

	

}
