package com.example.kaist.starbucks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] drinks ={"Drinks","Food","Cafe"};
        ListView listView = (ListView) findViewById(R.id.list_options);

        ListAdapter myadapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,drinks);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==0)
                {
                    Intent intent = new Intent(MainActivity.this, activitydrinkcategory.class);
                    startActivity(intent);
                }
            }
        });
    }
}
