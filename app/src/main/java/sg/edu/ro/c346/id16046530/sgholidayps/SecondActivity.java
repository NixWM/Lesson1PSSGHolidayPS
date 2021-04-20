package sg.edu.ro.c346.id16046530.sgholidayps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    ListView lv;
    TextView tvPH;
    ArrayList<Holiday> al;

    ArrayAdapter<Holiday> aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysecond);

        lv = (ListView) this.findViewById(R.id.lvHolidayTypes);
        tvPH = (TextView) this.findViewById(R.id.tvPlaceHolder);

        Intent intent = getIntent();
        int text = intent.getIntExtra("", 0);


        al = new ArrayList<Holiday>();


        if (text == 0) {
            tvPH.setText("Secular");

            al.add(new Holiday("new_year", "New Year's Day", "1 Jan 2017"));
            al.add(new Holiday("labour_day", "Labour Day", "1 May 2017"));
        } else if (text == 1) {
            tvPH.setText("Ethnics & Religion");

            al.add(new Holiday("cny", "Chinese New Year", "28-29 Jan 2017"));
            al.add(new Holiday("good_friday", "Good Friday", "14 April 2017"));

        }

        aa = new HolidayAdapter(this, R.layout.secondrow, al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday selectedType = al.get(position);

                Toast.makeText(SecondActivity.this, selectedType.getDay()
                                + " Date: " + selectedType.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });


    }


}