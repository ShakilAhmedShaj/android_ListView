package com.t3ch.shaj.android_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private String[] divisionNames;

    public int[] leftImages = {R.drawable.khulna, R.drawable.barishal, R.drawable.chittagong,
            R.drawable.dhaka, R.drawable.mymensingh, R.drawable.rangpur,
            R.drawable.sylhet};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        divisionNames = getResources().getStringArray(R.array.Divisions);

        listView = findViewById(R.id.ListView_ID);

        CustomAdapter adapter = new CustomAdapter(this,divisionNames,leftImages);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = divisionNames[position];
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
