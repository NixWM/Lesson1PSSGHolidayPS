package sg.edu.ro.c346.id16046530.sgholidayps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TypeAdapter extends ArrayAdapter<Type> {
    private ArrayList<Type> type;
    private Context context;
    private TextView tvType;

    public TypeAdapter(Context context, int resource, ArrayList<Type> objects) {
        super(context, resource, objects);

        type = objects;
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the firstrow.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.firstrow, parent, false);

        // Get the TextView object
        tvType = (TextView) rowView.findViewById(R.id.tvType);

        Type currentType = type.get(position);
        tvType.setText(currentType.getType());

        // Return the nicely done up View to the ListView
        return rowView;
    }
}