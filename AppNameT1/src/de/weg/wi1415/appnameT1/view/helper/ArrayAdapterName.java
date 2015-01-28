package de.weg.wi1415.appnameT1.view.helper;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.weg.wi1415.appnameT1.R;
import de.weg.wi1415.appnameT1.model.Name;

public class ArrayAdapterName extends ArrayAdapter<Name> {

	private Context context;
	private List<Name> dieNamen;
	
	public ArrayAdapterName(Context context, List<Name> namensListe) {
		super(context, R.layout.list_item_name, namensListe);
		this.context = context;
		this.dieNamen = namensListe;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflater = (LayoutInflater) context
		        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View row = inflater.inflate(R.layout.list_item_name, parent, false);
		
		//ImageView icon = (ImageView) row.findViewById(R.id.iv_gender);
		LinearLayout linLayout = (LinearLayout) row.findViewById(R.id.lin_layout_text);
		TextView vorname = (TextView) row.findViewById(R.id.vorname_value);
		TextView nachname = (TextView) row.findViewById(R.id.nachname_value);
		TextView separator = (TextView) row.findViewById(R.id.seperator);
		
		vorname.setText(dieNamen.get(position).getVorname());
		nachname.setText(dieNamen.get(position).getNachname() + "");
		
		if(position == 0) {
			separator.setVisibility(View.VISIBLE);
			separator.setText(dieNamen.get(position).getNachname().substring(0, 1));
		} else if(!dieNamen.get(position).getNachname().substring(0, 1).
				equals(dieNamen.get(position - 1).getNachname().substring(0, 1))) {
			separator.setVisibility(View.VISIBLE);
			separator.setText(dieNamen.get(position).getNachname().substring(0, 1));
		} else {
			separator.setVisibility(View.GONE);
			separator.setText("");
		}
		
		return row;
	}
}
