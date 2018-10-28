package com.example.kaist.starbucks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class activitydrinkcategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydrinkcategory);
        String[] drinks ={"Latte","Cappuccino","Filters"};
        ListView listView = (ListView) findViewById(R.id.list_joogid);

        ListAdapter myadapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,drinks);
        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==0)
                {
                    Intent intent = new Intent( activitydrinkcategory .this,activitylatte.class);
                    startActivity(intent);
                }
                if (position ==1)
                {
                    Intent intent = new Intent( activitydrinkcategory .this,activitycappuccino.class);
                    startActivity(intent);
                }
                if (position==2)
                {
                 Intent intent=new Intent(activitydrinkcategory.this,activityfilter.class);
                 startActivity(intent);
                }
            }
        });
    }
}
