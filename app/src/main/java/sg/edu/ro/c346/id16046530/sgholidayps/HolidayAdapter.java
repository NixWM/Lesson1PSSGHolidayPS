package sg.edu.ro.c346.id16046530.sgholidayps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private Context context;
    private ArrayList<Holiday> alHoliday;
    private TextView tvDay, tvDate;
    private ImageView ivPhoto;
    public HolidayAdapter(Context context,int resource,ArrayList<Holiday> objects){
        super(context,resource,objects);
        alHoliday = objects;
        this.context=context;
    }
    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.secondrow, parent, false);
        // Get the TextView object
        tvDay = (TextView) rowView.findViewById(R.id.tvDay);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        // Get the ImageView object
        ivPhoto = (ImageView) rowView.findViewById(R.id.ivPhoto);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the holiday at the same index.
        Holiday currentHoliday = alHoliday.get(position);

        // Set the TextView to show the day
        tvDay.setText(currentHoliday.getDay());

        // Set the TextView to show the day
        tvDate.setText(currentHoliday.getDate());

        // Set the image accordingly
        if(currentHoliday.getPhoto() == "new_year") {
            ivPhoto.setImageResource(R.drawable.new_year);

        }else if(currentHoliday.getPhoto() == "labour_day"){
            ivPhoto.setImageResource(R.drawable.labour_day);
        }else if(currentHoliday.getPhoto() == "cny") {
            ivPhoto.setImageResource(R.drawable.cny);
        }else if(currentHoliday.getPhoto() == "good_friday") {
            ivPhoto.setImageResource(R.drawable.good_friday);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}


