package de.weg.projekt.winf135.aufgabenapp.model;

import java.util.List;



import de.weg.projekt.winf135.aufgabenapp.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ArrayAdapterAufgabe extends ArrayAdapter<Aufgabe> {

	private Context context;
	private List<Aufgabe> dieAufgabe;
	
	public ArrayAdapterAufgabe(Context context, List<Aufgabe> aufgabenListe) {
		super(context, R.layout.list_item_aufg, aufgabenListe);
		this.context = context;
		this.dieAufgabe = aufgabenListe;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflater = (LayoutInflater) context
		        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View row = inflater.inflate(R.layout.list_item_aufg, parent, false);
		
		//ImageView icon = (ImageView) row.findViewById(R.id.iv_gender);

		LinearLayout linLayout = (LinearLayout) row.findViewById(R.id.lin_layout_text);
		TextView name = (TextView) row.findViewById(R.id.name_value);
		TextView beschreibung = (TextView) row.findViewById(R.id.beschreibung_value);
		//TextView separator = (TextView) row.findViewById(R.id.seperator);
		
		
		name.setText(dieAufgabe.get(position).getName());
		beschreibung.setText(dieAufgabe.get(position).getBeschreibung() + "");
		
	/*	if(position == 0) {
			separator.setVisibility(View.VISIBLE);
			separator.setText(dieAufgabe.get(position).getBeschreibung().substring(0, 1).toUpperCase());
		}
		else if(dieAufgabe.get(position).getBeschreibung().substring(0, 1).
				equalsIgnoreCase(dieAufgabe.get(position - 1).getBeschreibung().substring(0, 1))) 
		{
			separator.setVisibility(View.INVISIBLE);
			separator.setText("");
		}
		else
		{
			separator.setVisibility(View.VISIBLE);
			separator.setText(dieAufgabe.get(position).getBeschreibung().substring(0, 1).toUpperCase());
		}*/
		
		return row;
	}
}
