package sg.edu.ro.c346.id16046530.sgholidayps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Type> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = this.findViewById(R.id.lvTypes);

        // Create a few Type objects in Holiday array
        al = new ArrayList<Type>();
        al.add(new Type("Secular"));
        al.add(new Type("Ethnic & Religion"));

        // Link this Activity object, the row.xml layout for
        //  each row and the food String array together
        aa = new TypeAdapter(this, R.layout.firstrow,al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("", position);
                startActivity(intent);
            }
        });



    }
}