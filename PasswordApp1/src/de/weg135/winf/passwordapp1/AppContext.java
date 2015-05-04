package de.weg135.winf.passwordapp1;

import java.util.Collections;
import java.util.jar.Attributes.Name;

import de.weg135.winf.passwordapp1.modell.Account;
import java.util.Collections;

public class AppContext {

	private static AppContext instance = new AppContext();

	private AppContext() {
		this.init();
	}

	public static AppContext getInstance() {
		return instance;
	}

	public void init() {
		// AccountSpeicher.getInstance().ladeAlle(AccountListe);
		// Collections.sort(AccountListe);

	}

	private java.util.List<Account> accountListe = new java.util.ArrayList<Account>();

	public java.util.List<Account> getAccountListe() {
		// Collections.sort(AccountListe);
		return accountListe;
	}

}
