package com.mezan.materialspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.jaredrummler.materialspinner.MaterialSpinnerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> list = new ArrayList<>();
    MaterialSpinner spinner ;
    MaterialSpinnerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        list.add("Eleven");
        list.add("Twelve");

        adapter = new MaterialSpinnerAdapter(this,list);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {
                Toast.makeText(getApplicationContext(),list.get(position),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
