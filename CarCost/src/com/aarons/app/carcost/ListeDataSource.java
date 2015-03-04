package com.aarons.app.carcost;

import java.util.ArrayList;
import java.util.List;
import com.aarons.app.carcost.MySQLiteHelper;
import com.aarons.app.carcost.Entry;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;


public class ListeDataSource {

	
	private SQLiteDatabase database;
	private MySQLiteHelper dbHelper;
	private String[] allColumns = { "ID", "DATE", "PREIS", "LITER", "KILOMETER"};

	
	
	public ListeDataSource(Context context) {
		dbHelper = new MySQLiteHelper(context);
	}
	
	public void open() throws SQLException {
		database = dbHelper.getWritableDatabase();
	}

	public void close() {
		dbHelper.close();
	}
	
	public Entry createEntry(int zahl1, String operator, int zahl2) {
		ContentValues values = new ContentValues();
		values.put("ZAHL1", zahl1);
		values.put("OPERATOR", operator);
		values.put("ZAHL2", zahl2);

		long insertId = database.insert("VERLAUF", null,
				values);
		
		
		Cursor cursor = database.query("VERLAUF",allColumns, "ID = " + insertId, null, null, null, null);
		cursor.moveToFirst();
	
		return cursorToEntry(cursor);
	}

	protected List<Entry> getAllEntries() {
		List<Entry> EntriesList = new ArrayList<Entry>();
		EntriesList = new ArrayList<Entry>();
		
		Cursor cursor = database.query("VERLAUF", allColumns, null, null, null, null, null);
		cursor.moveToFirst();
		
		if(cursor.getCount() == 0) return EntriesList;
		
		
		while (cursor.isAfterLast() == false) {
			Entry entry = cursorToEntry(cursor);
			EntriesList.add(entry);
			cursor.moveToNext();
		} 	

		cursor.close();
		
		return EntriesList;	
	}
	

	private Entry cursorToEntry(Cursor cursor) {
		Entry entry = new Entry();
		entry.setId(cursor.getLong(0));
		entry.setZahl1(cursor.getInt(1));
		entry.setOperator(cursor.getString(2));
		entry.setZahl2(cursor.getInt(3));

		return entry;
	}
	
}
