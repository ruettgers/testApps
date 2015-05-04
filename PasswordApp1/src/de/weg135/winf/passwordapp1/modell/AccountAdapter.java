package de.weg135.winf.passwordapp1.modell;

import java.util.List;

import de.weg135.winf.passwordapp1.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;


public class AccountAdapter extends ArrayAdapter<Account> {

	private Context context;
	private List<Account> dieAcc;
	
	public AccountAdapter(Context context, List<Account> accListe) {
		super(context, R.layout.list_item_acc, accListe);
		this.context = context;
		this.dieAcc = accListe;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflater = (LayoutInflater) context
		        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View row = inflater.inflate(R.layout.list_item_acc, parent, false);
		
		//ImageView icon = (ImageView) row.findViewById(R.id.iv_gender);

		LinearLayout linLayout = (LinearLayout) row.findViewById(R.id.lin_layout_text);
		TextView name = (TextView) row.findViewById(R.id.name_value);
		TextView benutzername = (TextView) row.findViewById(R.id.benutzername_value);
		//TextView benutzername = (TextView) row.findViewById(R.id.benutzername_value); weiter machen und ändern
		
//		TextView separator = (TextView) row.findViewById(R.id.seperator);
		
		name.setText(dieAcc.get(position).getName());
		benutzername.setText(dieAcc.get(position).getBenutzername() + "");
		
/*		if(position == 0) {
			separator.setVisibility(View.VISIBLE);
			separator.setText(dieAcc.get(position).getBenutzername().substring(0, 1).toUpperCase());
		}
		else if(dieAcc.get(position).getName().substring(0, 1).
				equalsIgnoreCase(dieAcc.get(position - 1).getName().substring(0, 1))) 
		{
			separator.setVisibility(View.INVISIBLE);
			separator.setText("");
		}
		else
		{
			separator.setVisibility(View.VISIBLE);
			separator.setText(dieAcc.get(position).getName().substring(0, 1).toUpperCase());
		}
*/		
		return row;
	}
}
